/**
 * Copyright (c) 2006-2015 Hzins Ltd. All Rights Reserved. 
 *  
 * This code is the confidential and proprietary information of   
 * Hzins. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Hzins,http://www.hzins.com.
 *  
 */
package com.hzins.car.model.rep;

/**
 * <p>
 * 
 *
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年1月19日 上午11:20:56
 * @version
 */
public class GetCarInvalidDateByPlateNumRep {

    // 商业险终保日期
    private String bussinessInvalidDate;

    // 交强险终保日期
    private String strongInvalidDate;

    public String getBussinessInvalidDate() {
	return bussinessInvalidDate;
    }

    public void setBussinessInvalidDate(String bussinessInvalidDate) {
	this.bussinessInvalidDate = bussinessInvalidDate;
    }

    public String getStrongInvalidDate() {
	return strongInvalidDate;
    }

    public void setStrongInvalidDate(String strongInvalidDate) {
	this.strongInvalidDate = strongInvalidDate;
    }

}
