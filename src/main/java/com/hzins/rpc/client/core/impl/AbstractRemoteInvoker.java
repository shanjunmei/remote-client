/**
 * Copyright (c) 2006-2015 Hzins Ltd. All Rights Reserved. 
 *  
 * This code is the confidential and proprietary information of   
 * Hzins. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Hzins,http://www.hzins.com.
 *  
 */
package com.hzins.rpc.client.core.impl;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hzins.rpc.client.core.Command;
import com.hzins.rpc.client.core.Invoker;
import com.hzins.rpc.client.core.ParameterType;
import com.hzins.rpc.client.core.RpcType;
import com.hzins.rpc.client.core.ServiceInfo;
import com.hzins.rpc.client.core.TransferMode;

/**
 * <p>
 * 
 *
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年1月19日 下午5:27:24
 * @version
 */
public abstract class AbstractRemoteInvoker implements Invoker {

    protected final static ObjectMapper objectMapper = new ObjectMapper();

    protected JavaType getResponseType(Type type) {
	return objectMapper.getTypeFactory().constructType(type);
    }

    public abstract <T> T invoke(Type returnType, Object api, Object param);

    /*
     * (non-Javadoc)
     * 
     * @see com.hzins.common.Invoker#invoke(java.lang.reflect.Method,
     * java.lang.Object[])
     */
    @Override
    public Object invoke(Method method, Object[] args) {
	String methodName = buildCommand(method);

	ServiceInfo serverInfo = method.getAnnotation(ServiceInfo.class);
	if (serverInfo == null) {
	    Class<?> pc = method.getDeclaringClass();
	    serverInfo = pc.getAnnotation(ServiceInfo.class);
	}
	if (serverInfo == null) {
	    throw new RuntimeException("no " + ServiceInfo.class.getName() + " found");
	}
	RpcType rpcType = serverInfo.type();
	String base = serverInfo.value();
	TransferMode transferMode = serverInfo.transferMode();

	if (RpcType.HTTP.equals(rpcType)) {
	    if (TransferMode.OUT.equals(transferMode)) {
		base += "/" + methodName;
	    }
	}

	Object param = buildParameter(serverInfo, args, method);
	if (RpcType.HTTP.equals(rpcType)) {
	    return invoke(method.getGenericReturnType(), base, param);
	} else if (RpcType.MQ.equals(rpcType)) {
	    return invoke(method.getGenericReturnType(), null, param);
	}else{
	    throw new RuntimeException("RpcType :"+rpcType+" is not implement");
	}

    }

    @Override
    public String buildCommand(Method method) {
	Command api = method.getAnnotation(Command.class);
	String methodName = method.getName();
	if (api != null && api.value() != null && api.value().trim().length() > 0) {
	    methodName = api.value();
	}
	return methodName;
    }

    // 重建请求参数
    @Override
    public Object buildParameter(ServiceInfo serverInfo, Object[] params, Method method) {
	TransferMode transferMode = serverInfo.transferMode();
	String commandKey = serverInfo.commondKey();
	String parameterKey = serverInfo.parameterKey();
	ParameterType parameterType = serverInfo.parameterType();

	int pc = method.getParameterTypes().length;
	Object actualParam = null;
	if (pc == 1) {
	    actualParam = params[0];
	} else {
	    actualParam = params;
	}

	if (TransferMode.INNER.equals(transferMode)) {
	    String methodName = buildCommand(method);
	    Map<String, Object> p = new HashMap<>();
	    p.put(commandKey, methodName);
	    if (ParameterType.ARRAY.equals(parameterType)) {
		List<Object> array = new ArrayList<>();
		if (actualParam != null) {
		    array.add(actualParam);
		}
		p.put(parameterKey, array);
	    } else if (ParameterType.Object.equals(parameterType)) {
		p.put(parameterKey, actualParam);
	    }

	    actualParam = p;
	}

	return actualParam;
    }

    @Override
    public <T> T buildResponse(Type returnType, InputStream is) {
	T res;
	try {
	    res = objectMapper.readValue(is, getResponseType(returnType));
	    return res;
	} catch (IOException e) {
	    throw new RuntimeException(e);
	}

    }

    @Override
    public <T> T buildResponse(Type returnType, String response) {
	T res;
	try {
	    res = objectMapper.readValue(response, getResponseType(returnType));
	    return res;
	} catch (IOException e) {
	    throw new RuntimeException(e);
	}

    }

}
