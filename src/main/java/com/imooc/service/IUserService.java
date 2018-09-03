package com.imooc.service;

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

}
