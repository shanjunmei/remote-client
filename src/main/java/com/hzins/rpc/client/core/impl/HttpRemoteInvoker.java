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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.hzins.common.Configure;

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
public class HttpRemoteInvoker extends AbstractRemoteInvoker {

    @Override
    public <T> T invoke(Type returnType, Object _url, Object obj) {

	try {
	    URL url = new URL(_url.toString());
	    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	    connection.addRequestProperty("Content-Type", Configure.Request.contentType);
	    connection.addRequestProperty("User-Agent", Configure.Request.userAgent);
	    connection.setConnectTimeout(Configure.Request.http_connection_timeout);
	    connection.setReadTimeout(Configure.Request.http_read_timeout);
	    connection.setRequestMethod("POST");
	    connection.setDoOutput(true);

	    objectMapper.writeValue(connection.getOutputStream(), obj);
	    int status = connection.getResponseCode();

	    if (status == 200) {
		T res = buildResponse(returnType, connection.getInputStream());
		return res;

	    } else {
		BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getErrorStream(), "utf-8"));
		StringBuffer message = new StringBuffer();
		while (reader.ready()) {
		    message.append(reader.readLine());
		}
		throw new RuntimeException(message.toString());
	    }
	} catch (MalformedURLException e) {
	    throw new RuntimeException(e);
	} catch (IOException e) {
	    throw new RuntimeException(e);
	}

    }

}
