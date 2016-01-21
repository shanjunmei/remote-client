/**
 * Copyright (c) 2006-2015 Hzins Ltd. All Rights Reserved. 
 *  
 * This code is the confidential and proprietary information of   
 * Hzins. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Hzins,http://www.hzins.com.
 *  
 */
package com.hzins.car;

import java.util.List;

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
import com.hzins.common.Configure;
import com.hzins.common.Rep;
import com.hzins.rpc.client.core.ParameterType;
import com.hzins.rpc.client.core.ServiceInfo;

/**
 * <p>
 * 
 *
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年1月19日 上午11:19:34
 * @version
 */
@ServiceInfo(value=Configure.Channel.baseUrl,parameterType=ParameterType.ARRAY)
public interface VehicleInsuranceOperation {

    /**
     * 
     * <p>
     * 
     * 根据车牌号获取终保日期
     *
     * </p>
     * 
     * @param req
     * @return
     * 
     * @author hz15101769
     * @date 2016年1月20日 下午2:09:34
     * @version
     */
    public Rep<GetCarInvalidDateByPlateNumRep> getCarInvalidDateByPlateNum(GetCarInvalidDateByPlateNumReq req);

    /**
     * 
     * <p>
     * 
     * 获取保障项目
     *
     * </p>
     * 
     * @param req
     * @return
     * 
     * @author hz15101769
     * @date 2016年1月20日 下午2:09:40
     * @version
     */
    public Rep<List<GetAllCarProtectItemsByParamsRep>> getAllCarProtectItemsByParams(GetAllCarProtectItemsByParamsReq req);

    /**
     * 
     * <p>
     * 
     * 询价信息保存
     *
     * </p>
     * 
     * @param req
     * @return
     * 
     * @author hz15101769
     * @date 2016年1月20日 下午2:10:03
     * @version
     */
    public Rep<SaveJMEnquiryRep> saveJMEnquiry(SaveJMEnquiryReq req);

    /**
     * 
     * <p>
     * 
     * 投保
     *
     * </p>
     * 
     * @param req
     * @return
     * 
     * @author hz15101769
     * @date 2016年1月20日 下午2:10:16
     * @version
     */
    public Rep<SaveJMInsureRep> saveJMInsure(SaveJMInsureReq req);

    /**
     * 
     * <p>
     * 
     * 修改投保信息
     *
     * </p>
     * 
     * @param req
     * @return
     * 
     * @author hz15101769
     * @date 2016年1月20日 下午2:09:19
     * @version
     */
    public Rep<UpdateJMInsureRep> updateJMInsure(UpdateJMInsureReq req);

    /**
     * 
     * <p>
     * 
     * 修改支付状态
     *
     * </p>
     * 
     * @param req
     * @return
     * 
     * @author hz15101769
     * @date 2016年1月20日 下午2:20:18
     * @version
     */
    public Rep<Boolean> updatePayFinishState(UpdatePayFinishStateReq req);

    /**
     * 
     * <p>
     * 
     * 根据分支机构id获取可投保地市信息（包含省级信息）
     *
     * </p>
     * 
     * @return
     * 
     * @author hz15101769
     * @date 2016年1月20日 下午2:36:47
     * @version
     */
    public Rep<List<String>> getAreaListByBranchId(Integer req);
    
    /**
     * 
     * <p>
     * 
     *撤销投保
     *
     * </p>
     * @param req
     * @return
     *  
     * @author	hz15101769 
     * @date	2016年1月20日 下午2:44:03
     * @version
     */
    public Rep<Boolean> rescindInsure(String req);

}
