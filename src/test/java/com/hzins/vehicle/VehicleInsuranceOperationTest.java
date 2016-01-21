/**
 * Copyright (c) 2006-2015 Hzins Ltd. All Rights Reserved. 
 *  
 * This code is the confidential and proprietary information of   
 * Hzins. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Hzins,http://www.hzins.com.
 *  
 */
package com.hzins.vehicle;

import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hzins.car.VehicleInsuranceOperation;
import com.hzins.car.model.rep.GetAllCarProtectItemsByParamsRep;
import com.hzins.car.model.rep.GetCarInvalidDateByPlateNumRep;
import com.hzins.car.model.rep.SaveJMEnquiryRep;
import com.hzins.car.model.rep.SaveJMInsureRep;
import com.hzins.car.model.rep.UpdateJMInsureRep;
import com.hzins.car.model.req.GetAllCarProtectItemsByParamsReq;
import com.hzins.car.model.req.GetCarInvalidDateByPlateNumReq;
import com.hzins.car.model.req.SaveJMEnquiryReq;
import com.hzins.car.model.req.SaveJMInsureReq;
import com.hzins.car.model.req.UpdateJMInsureReq;
import com.hzins.car.model.req.UpdatePayFinishStateReq;
import com.hzins.common.Rep;
import com.hzins.rpc.client.core.ProxyFactory;

/**
 * <p>
 * 
 *
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年1月19日 上午11:29:37
 * @version
 */
public class VehicleInsuranceOperationTest {

    static VehicleInsuranceOperation operation = ProxyFactory.createRpcProxy(VehicleInsuranceOperation.class);

    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testGetCarInvalidDateByPlateNum() throws JsonProcessingException {
	GetCarInvalidDateByPlateNumReq req = new GetCarInvalidDateByPlateNumReq();

	req.setPlateNum("粤B123");

	Rep<GetCarInvalidDateByPlateNumRep> rep = operation.getCarInvalidDateByPlateNum(req);

	System.out.println(objectMapper.writeValueAsString(rep));
    }

    @Test
    public void testGetAllCarProtectItemsByParams() throws JsonProcessingException {
	GetAllCarProtectItemsByParamsReq req = new GetAllCarProtectItemsByParamsReq();

	req.setBranchId(46);
	req.setAreaNum("9999");

	try {
	    Rep<List<GetAllCarProtectItemsByParamsRep>> rep = operation.getAllCarProtectItemsByParams(req);

	    System.out.println(objectMapper.writeValueAsString(rep));
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    @Test
    public void testsaveJMEnquiry() throws JsonProcessingException {
	SaveJMEnquiryReq req = new SaveJMEnquiryReq();

	Rep<SaveJMEnquiryRep> rep = operation.saveJMEnquiry(req);

	System.out.println(objectMapper.writeValueAsString(rep));
    }

    @Test
    public void testsaveJMInsure() throws JsonProcessingException {
	SaveJMInsureReq req = new SaveJMInsureReq();

	Rep<SaveJMInsureRep> rep = operation.saveJMInsure(req);

	System.out.println(objectMapper.writeValueAsString(rep));
    }

    @Test
    public void testupdateJMInsure() throws JsonProcessingException {
	UpdateJMInsureReq req = new UpdateJMInsureReq();

	Rep<UpdateJMInsureRep> rep = operation.updateJMInsure(req);

	System.out.println(objectMapper.writeValueAsString(rep));
    }

    @Test
    public void testupdatePayFinishState() throws JsonProcessingException {
	UpdatePayFinishStateReq req = new UpdatePayFinishStateReq();

	Rep<Boolean> rep = operation.updatePayFinishState(req);

	System.out.println(objectMapper.writeValueAsString(rep));
    }

    @Test
    public void testgetAreaListByBranchId() throws JsonProcessingException {
	Rep<List<String>> rep = operation.getAreaListByBranchId(46);

	System.out.println(objectMapper.writeValueAsString(rep));
    }

    @Test
    public void testrescindInsure() throws JsonProcessingException {
	Rep<Boolean> rep = operation.rescindInsure("3");

	System.out.println(objectMapper.writeValueAsString(rep));
    }
}
