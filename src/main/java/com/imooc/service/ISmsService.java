package com.imooc.service;

import com.imooc.base.ServiceResult;

/**
 * 验证码服务
 * @author youyusong
 * @date 2018/10/5
 */
public interface ISmsService {

    /**
     * 非诉讼验证码到指定手机, 并缓存验证码 10 分钟及请求间隔时间 1 分钟
     * @param telephone
     * @return
     */
    ServiceResult<String> sendSms(String telephone);

    /**
     * 获取缓存中的验证码
     * @param telephone
     * @return
     */
    String getSmsCode(String telephone);

    /**
     * 移除验证码
     * @param telephone
     */
    void removeSms(String telephone);

}
