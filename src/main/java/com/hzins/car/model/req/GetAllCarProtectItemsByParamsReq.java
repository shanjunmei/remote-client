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
 * @date 2016年1月19日 下午2:35:19
 * @version
 */
public class GetAllCarProtectItemsByParamsReq {

    private Integer branchId;// 分支结构id

    private String areaNum; // 区域编码

    public Integer getBranchId() {
	return branchId;
    }

    public void setBranchId(Integer branchId) {
	this.branchId = branchId;
    }

    public String getAreaNum() {
	return areaNum;
    }

    public void setAreaNum(String areaNum) {
	this.areaNum = areaNum;
    }

}
