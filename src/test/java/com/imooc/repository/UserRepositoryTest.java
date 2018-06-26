package com.imooc.repository;

import com.imooc.ApplicationTests;
import com.imooc.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * 用户管理测试
 * @author youyusong
 * @date 2018/6/25
 */
public class UserRepositoryTest extends ApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void findOne() {
        User user = userRepository.findOne(1L);
        Assert.assertEquals("song", user.getName());
    }


}