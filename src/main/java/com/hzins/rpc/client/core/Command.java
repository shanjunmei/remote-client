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
 *命令映射
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年1月7日 上午8:07:31
 * @version
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Command {

    String value() default "";
}
