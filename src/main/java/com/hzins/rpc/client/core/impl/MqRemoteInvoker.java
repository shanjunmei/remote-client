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

import java.lang.reflect.Type;

/**
 * <p>
 * 
 * 远程方法调用
 *
 * </p>
 * 
 * @author 李淼淼
 * @date 2016年1月7日 上午8:00:52
 * @version
 */
public class MqRemoteInvoker extends AbstractRemoteInvoker {

    @Override
    public <T> T invoke(Type returnType, Object _url, Object obj) {
	throw new RuntimeException("not implement");
    }

}
