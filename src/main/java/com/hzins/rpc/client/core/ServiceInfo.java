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

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * <p>
 * 
 *服务信息
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年1月21日 上午10:00:11
 * @version
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface ServiceInfo {

    String value();

    RpcType type() default RpcType.HTTP;

    TransferMode transferMode() default TransferMode.INNER;

    String commondKey() default "command";

    String parameterKey() default "parameters";
    
    ParameterType parameterType() default ParameterType.Object;
}
