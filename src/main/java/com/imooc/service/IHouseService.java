package com.imooc.service;

import com.imooc.base.ServiceResult;
import com.imooc.dto.HouseDTO;
import com.imooc.form.HouseForm;

/**
 * 房屋管理服务接口
 * @author youyusong
 * @date 2018/9/6
 */
public interface IHouseService {

    /**
     * 新增房屋
     * @param houseForm
     * @return
     */
    ServiceResult<HouseDTO> save(HouseForm houseForm);


}
