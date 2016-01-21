/**
 * Copyright (c) 2006-2015 Hzins Ltd. All Rights Reserved. 
 *  
 * This code is the confidential and proprietary information of   
 * Hzins. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Hzins,http://www.hzins.com.
 *  
 */
package com.hzins.car.model.info;

/**
 * <p>
 * 
 *
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年1月19日 下午4:03:18
 * @version
 */
public class CarInfo {

    // 车架号
    private String frameNo;// "LBVCU3102DSH16008",
    // 投保区域编码

    private String insureAreaNum;// "370100",

    // 是否过户车辆（0：否，1：是）
    private Integer isTransfer;// 0,

    // 过户日期
    private String transferTime;// :”2015-01-23 08:29:44”,

    // 新车是否上牌照，1未上牌，0上牌
    private Integer newCarLicenseFlag;// : 0,

    // 证件类型 // 1=身份证;2=护照；3=军官证；4=港澳回乡证；5=台胞证；6=组织机构代码证；7=税务登记证；8=其他
    private Integer owerCardType;// : 1,

    // 车主
    private String owner;// : "陈 俊",

    // 证件号码
    private String ownerCardNum;// ": "500231199105083012",

    // 车主所属性质（1：私人，2：企业，3：机关）
    private Integer ownerKind;// : 1,

    // 车牌
    private String plateNum;// : "鲁A12008",

    // 注册日期
    private String registerTime;// : "2015-09-14 00:00:00",

    // 精友ID
    private String vehicleId;// : "I0 000000000000000250000000000239",

    // 车辆使用性质（0：非营业，1：营业）
    private Integer vehicleUseKind;// : 0,

    // 车辆使用性质类型（1，城市公交客车，2，出租车，3，租赁客车，4，公路营运客车，5，货车，6，家庭自用汽车，7，客车，8，货车）
    private Integer vehicleUseKindType;// : 6,

    public String getFrameNo() {
	return frameNo;
    }

    public void setFrameNo(String frameNo) {
	this.frameNo = frameNo;
    }

    public String getInsureAreaNum() {
	return insureAreaNum;
    }

    public void setInsureAreaNum(String insureAreaNum) {
	this.insureAreaNum = insureAreaNum;
    }

    public Integer getIsTransfer() {
	return isTransfer;
    }

    public void setIsTransfer(Integer isTransfer) {
	this.isTransfer = isTransfer;
    }

    public String getTransferTime() {
	return transferTime;
    }

    public void setTransferTime(String transferTime) {
	this.transferTime = transferTime;
    }

    public Integer getNewCarLicenseFlag() {
	return newCarLicenseFlag;
    }

    public void setNewCarLicenseFlag(Integer newCarLicenseFlag) {
	this.newCarLicenseFlag = newCarLicenseFlag;
    }

    public Integer getOwerCardType() {
	return owerCardType;
    }

    public void setOwerCardType(Integer owerCardType) {
	this.owerCardType = owerCardType;
    }

    public String getOwner() {
	return owner;
    }

    public void setOwner(String owner) {
	this.owner = owner;
    }

    public String getOwnerCardNum() {
	return ownerCardNum;
    }

    public void setOwnerCardNum(String ownerCardNum) {
	this.ownerCardNum = ownerCardNum;
    }

    public Integer getOwnerKind() {
	return ownerKind;
    }

    public void setOwnerKind(Integer ownerKind) {
	this.ownerKind = ownerKind;
    }

    public String getPlateNum() {
	return plateNum;
    }

    public void setPlateNum(String plateNum) {
	this.plateNum = plateNum;
    }

    public String getRegisterTime() {
	return registerTime;
    }

    public void setRegisterTime(String registerTime) {
	this.registerTime = registerTime;
    }

    public String getVehicleId() {
	return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
	this.vehicleId = vehicleId;
    }

    public Integer getVehicleUseKind() {
	return vehicleUseKind;
    }

    public void setVehicleUseKind(Integer vehicleUseKind) {
	this.vehicleUseKind = vehicleUseKind;
    }

    public Integer getVehicleUseKindType() {
	return vehicleUseKindType;
    }

    public void setVehicleUseKindType(Integer vehicleUseKindType) {
	this.vehicleUseKindType = vehicleUseKindType;
    }

}
