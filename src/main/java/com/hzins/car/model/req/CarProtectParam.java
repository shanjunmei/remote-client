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
 * @date 2016年1月19日 下午4:12:39
 * @version
 */
public class CarProtectParam {

    private String insureValue;

    private Integer isNoDeductible;

    private Integer protectItemId;

    public String getInsureValue() {
	return insureValue;
    }

    public void setInsureValue(String insureValue) {
	this.insureValue = insureValue;
    }

    public Integer getIsNoDeductible() {
	return isNoDeductible;
    }

    public void setIsNoDeductible(Integer isNoDeductible) {
	this.isNoDeductible = isNoDeductible;
    }

    public Integer getProtectItemId() {
	return protectItemId;
    }

    public void setProtectItemId(Integer protectItemId) {
	this.protectItemId = protectItemId;
    }

}
