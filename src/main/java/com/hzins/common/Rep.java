/**
 * Copyright (c) 2006-2015 Hzins Ltd. All Rights Reserved. 
 *  
 * This code is the confidential and proprietary information of   
 * Hzins. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Hzins,http://www.hzins.com.
 *  
 */
package com.hzins.common;

/**
 * <p>
 * 
 *
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年1月19日 上午11:23:13
 * @version
 */
public class Rep<T> {

    private String exception;

    private String status;

    private T result;

    public String getException() {
	return exception;
    }

    public void setException(String exception) {
	this.exception = exception;
    }

    public String getStatus() {
	return status;
    }

    public void setStatus(String status) {
	this.status = status;
    }

    public T getResult() {
	return result;
    }

    public void setResult(T result) {
	this.result = result;
    }

}
