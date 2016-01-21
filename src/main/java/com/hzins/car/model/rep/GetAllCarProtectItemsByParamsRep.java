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

import java.util.List;

import com.hzins.car.model.info.Text;

/**
 * <p>
 * 
 *
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年1月19日 下午2:35:33
 * @version
 */
public class GetAllCarProtectItemsByParamsRep {

    private Integer id;

    private Integer isNoDeductible;

    private String name;

    // 1表示附加险，0是基本险
    private Integer isLoss;

    private List<Text> carProtectValues;

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public Integer getIsNoDeductible() {
	return isNoDeductible;
    }

    public void setIsNoDeductible(Integer isNoDeductible) {
	this.isNoDeductible = isNoDeductible;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public Integer getIsLoss() {
	return isLoss;
    }

    public void setIsLoss(Integer isLoss) {
	this.isLoss = isLoss;
    }

    public List<Text> getCarProtectValues() {
	return carProtectValues;
    }

    public void setCarProtectValues(List<Text> carProtectValues) {
	this.carProtectValues = carProtectValues;
    }

}
