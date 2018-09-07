package com.imooc.repository;

import com.imooc.entity.HouseTag;
import org.springframework.data.repository.CrudRepository;

/**
 * 房屋标签映射关系DAO
 * @author youyusong
 * @date 2018/9/6
 */
public interface HouseTagRepository extends CrudRepository<HouseTag, Long> {
}
