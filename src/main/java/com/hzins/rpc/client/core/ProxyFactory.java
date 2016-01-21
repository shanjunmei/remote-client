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

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.hzins.rpc.client.core.impl.HttpRemoteInvoker;
import com.hzins.rpc.client.core.impl.MqRemoteInvoker;

/**
 * <p>
 * 
 * 代理工厂
 *
 * </p>
 * 
 * @author 李淼淼
 * @date 2016年1月7日 上午8:03:17
 * @version
 */
public class ProxyFactory {

    
    
    
    
    /**
     * 
     * <p>
     * 
     * 创建真实调用者
     *
     * </p>
     * 
     * @param type
     * @return
     * 
     * @author hz15101769
     * @date 2016年1月21日 下午1:52:09
     * @version
     */
    public static Invoker createInvoker(RpcType type) {
	if (RpcType.HTTP.equals(type)) {
	    return new HttpRemoteInvoker();
	} else if (RpcType.MQ.equals(type)) {
	    return new MqRemoteInvoker();
	} else {
	    throw new RuntimeException("RpcType is error found");
	}
    }

    /**
     * 
     * <p>
     * 
     * 创建远程调用代理
     *
     * </p>
     * 
     * @param cls
     * @return
     * 
     * @author hz15101769
     * @date 2016年1月21日 下午1:52:28
     * @version
     */
    @SuppressWarnings("unchecked")
    public static <I> I createRpcProxy(Class<I> cls) {
	ServiceInfo info = cls.getAnnotation(ServiceInfo.class);
	if (info == null) {
	    throw new RuntimeException("no " + ServiceInfo.class.getName() + " found");
	}
	RpcType type = info.type();
	Invoker invoker = createInvoker(type);
	return (I) Proxy.newProxyInstance(cls.getClassLoader(), new Class[] { cls }, new RpcInvokerProxy(invoker));

    }

    static class RpcInvokerProxy implements InvocationHandler {

	Invoker invoker;

	public RpcInvokerProxy(Invoker invoker) {
	    this.invoker = invoker;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
	    return invoker.invoke(method, args);
	}

    }

}
