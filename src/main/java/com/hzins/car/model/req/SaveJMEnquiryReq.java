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

import java.util.List;

import com.hzins.car.model.info.CarInfo;

/**
 * <p>
 * 
 *
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年1月19日 下午3:48:13
 * @version
 */
public class SaveJMEnquiryReq {

    // 交强险开始时间
    private String trafficInsureStartTime;

    // 商业险开始时间
    private String busiInsureStartTime;

    private CarInfo carInfo;

    private List<CarProtectParam> carProtectParams;

    private List<Company> companys;

    // 交强险或商业险选择判断（1，只选交强险，2，只选商业险，3，两者都选）
    private Integer insureSelectFlag;

    // 是否购买车船税（0，不购买，1购买）
    private Integer isBuyTravelTax;

    // 17. 聚米h5 ，12.聚米pc
    private Integer platformFlag;

    // 平台用户id
    private Integer platformUserId;

    public String getTrafficInsureStartTime() {
	return trafficInsureStartTime;
    }

    public void setTrafficInsureStartTime(String trafficInsureStartTime) {
	this.trafficInsureStartTime = trafficInsureStartTime;
    }

    public String getBusiInsureStartTime() {
	return busiInsureStartTime;
    }

    public void setBusiInsureStartTime(String busiInsureStartTime) {
	this.busiInsureStartTime = busiInsureStartTime;
    }

    public CarInfo getCarInfo() {
	return carInfo;
    }

    public void setCarInfo(CarInfo carInfo) {
	this.carInfo = carInfo;
    }

    public List<CarProtectParam> getCarProtectParams() {
	return carProtectParams;
    }

    public void setCarProtectParams(List<CarProtectParam> carProtectParams) {
	this.carProtectParams = carProtectParams;
    }

    public List<Company> getCompanys() {
	return companys;
    }

    public void setCompanys(List<Company> companys) {
	this.companys = companys;
    }

    public Integer getInsureSelectFlag() {
	return insureSelectFlag;
    }

    public void setInsureSelectFlag(Integer insureSelectFlag) {
	this.insureSelectFlag = insureSelectFlag;
    }

    public Integer getIsBuyTravelTax() {
	return isBuyTravelTax;
    }

    public void setIsBuyTravelTax(Integer isBuyTravelTax) {
	this.isBuyTravelTax = isBuyTravelTax;
    }

    public Integer getPlatformFlag() {
	return platformFlag;
    }

    public void setPlatformFlag(Integer platformFlag) {
	this.platformFlag = platformFlag;
    }

    public Integer getPlatformUserId() {
	return platformUserId;
    }

    public void setPlatformUserId(Integer platformUserId) {
	this.platformUserId = platformUserId;
    }

}
