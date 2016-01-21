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
 * @date 2016年1月20日 下午2:02:25
 * @version
 */
public class UpdateJMInsureReq {

    // 投保单号
    private String insureNum;// ”:”CXJ151218102031640890”,

    // 投保人姓名
    private String applicant;// ": "陈俊",

    // 证件类型
    // 1=身份证;2=护照；3=军官证；4=港澳回乡证；5=台胞证；6=组织机构代码证；7=税务登记证；8=其他
    private Integer applicantCardType;// ": 1,

    // 证件号码
    private String applicantCardNum;// ": "500231199105083012",

    // 1:同车主 2：同投保人 3：其他
    private Integer insurantType;// ": 1,

    // 被保险人
    private String insurant;// ": "陈俊",

    // 证件类型
    // 1=身份证;2=护照；3=军官证；4=港澳回乡证；5=台胞证；6=组织机构代码证；7=税务登记证；8=其他
    private Integer insurantCardType;// ": 1,

    // 证件号码
    private String insurantCardNum;// ": "500231199105083012",

    // 寄送方法 1:配送 2:自提
    private Integer expreWay;// ": 2,

    // 收件人
    private String expreReceiver;// ": "张三",

    private String expreAddress;// ": "深圳市南山区南海大道粤海路深圳动漫园3-4栋5F",

    private String expreMobile;// : "15369856214",

    public String getInsureNum() {
	return insureNum;
    }

    public void setInsureNum(String insureNum) {
	this.insureNum = insureNum;
    }

    public String getApplicant() {
	return applicant;
    }

    public void setApplicant(String applicant) {
	this.applicant = applicant;
    }

    public Integer getApplicantCardType() {
	return applicantCardType;
    }

    public void setApplicantCardType(Integer applicantCardType) {
	this.applicantCardType = applicantCardType;
    }

    public String getApplicantCardNum() {
	return applicantCardNum;
    }

    public void setApplicantCardNum(String applicantCardNum) {
	this.applicantCardNum = applicantCardNum;
    }

    public Integer getInsurantType() {
	return insurantType;
    }

    public void setInsurantType(Integer insurantType) {
	this.insurantType = insurantType;
    }

    public String getInsurant() {
	return insurant;
    }

    public void setInsurant(String insurant) {
	this.insurant = insurant;
    }

    public Integer getInsurantCardType() {
	return insurantCardType;
    }

    public void setInsurantCardType(Integer insurantCardType) {
	this.insurantCardType = insurantCardType;
    }

    public String getInsurantCardNum() {
	return insurantCardNum;
    }

    public void setInsurantCardNum(String insurantCardNum) {
	this.insurantCardNum = insurantCardNum;
    }

    public Integer getExpreWay() {
	return expreWay;
    }

    public void setExpreWay(Integer expreWay) {
	this.expreWay = expreWay;
    }

    public String getExpreReceiver() {
	return expreReceiver;
    }

    public void setExpreReceiver(String expreReceiver) {
	this.expreReceiver = expreReceiver;
    }

    public String getExpreAddress() {
	return expreAddress;
    }

    public void setExpreAddress(String expreAddress) {
	this.expreAddress = expreAddress;
    }

    public String getExpreMobile() {
	return expreMobile;
    }

    public void setExpreMobile(String expreMobile) {
	this.expreMobile = expreMobile;
    }

}
