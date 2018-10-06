package com.imooc.service;

import com.imooc.base.ServiceResult;
import com.imooc.dto.UserDTO;
import com.imooc.entity.User;

/**
 * 用户服务
 * @author youyusong
 * @date 2018/9/3
 */
public interface IUserService {

    /**
     * 通过用户名查找用户
     * @param userName
     * @return
     */
    User findUserByName(String userName);

    /**
     * 根据用户ID寻找用户
     * @param userId
     * @return
     */
    ServiceResult<UserDTO> findById(Long userId);

    /**
     * 根据电话号码寻找用户
     * @param telephone
     * @return
     */
    User findUserByTelephone(String telephone);

    /**
     * 通过手机号注册用户
     * @param telephone
     * @return
     */
    User addUserByPhone(String telephone);

    /**
     * 修改指定属性值
     * @param profile
     * @param value
     * @return
     */
    ServiceResult modifyUserProfile(String profile, String value);

}
