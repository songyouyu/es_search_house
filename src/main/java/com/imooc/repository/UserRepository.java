package com.imooc.repository;

import com.imooc.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * 用户管理dao
 * @author youyusong
 * @date 2018/6/25
 */
public interface UserRepository extends CrudRepository<User, Long> {

    User findByName(String userName);

}
