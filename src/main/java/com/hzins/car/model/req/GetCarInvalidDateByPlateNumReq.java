/**
 * Copyright (c) 2006-2015 Hzins Ltd. All Rights Reserved. 
 *  
 * This code is the confidential and proprietary information of   
 * Hzins. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Hzins,http://www.hzins.com.
 *  
 */
package com.hzins.car.model.req;

/**
 * <p>
 * 
 *
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年1月19日 上午11:20:36
 * @version
 */
public class GetCarInvalidDateByPlateNumReq {

    // 车牌号
    private String plateNum;

    public String getPlateNum() {
	return plateNum;
    }

    public void setPlateNum(String plateNum) {
	this.plateNum = plateNum;
    }

}
