package com.imooc.controller;

import com.imooc.base.ApiResponse;
import com.imooc.base.ServiceMultiResult;
import com.imooc.dto.SupportAddressDTO;
import com.imooc.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 房源信息管理
 * @author youyusong
 * @date 2018/9/6
 */
@Controller
public class HouseController {

    @Autowired
    private IAddressService addressService;

    /**
     * 获取所有城市
     * @return
     */
    @GetMapping("address/support/cities")
    @ResponseBody
    public ApiResponse getSupportCities() {
        ServiceMultiResult<SupportAddressDTO> result = addressService.findAllCities();
        if (result.getResultSize() == 0) {
            return ApiResponse.ofStatus(ApiResponse.Status.NOT_FOUND);
        }
        return ApiResponse.ofSuccess(result.getResult());
    }
}
