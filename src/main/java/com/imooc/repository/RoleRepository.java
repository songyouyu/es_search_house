package com.imooc.repository;

import com.imooc.entity.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * 角色数据DAO
 * @author youyusong
 * @date 2018/9/3
 */
public interface RoleRepository extends CrudRepository<Role, Long> {

    List<Role> findRoleByUserId(Long userId);
}
