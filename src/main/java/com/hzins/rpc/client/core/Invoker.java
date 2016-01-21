/**
 * Copyright (c) 2006-2015 Hzins Ltd. All Rights Reserved. 
 *  
 * This code is the confidential and proprietary information of   
 * Hzins. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Hzins,http://www.hzins.com.
 *  
 */
package com.hzins.rpc.client.core;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/**
 * <p>
 * 
 *方法调用接口，包含参数转换
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年1月21日 下午12:48:08
 * @version
 */
public interface Invoker {

    Object invoke(Method method, Object[] args);

    String buildCommand(Method method);

    Object buildParameter(ServiceInfo serverInfo, Object[] params, Method method);

    <T> T buildResponse(Type returnType, InputStream is);

    <T> T buildResponse(Type returnType, String response);

}