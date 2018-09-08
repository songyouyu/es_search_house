package com.imooc.repository;

import com.imooc.entity.House;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * 房屋DAO(使用 PagingAndSortingRepository 做分页排序)
 * @author youyusong
 * @date 2018/9/6
 */
public interface HouseRepository extends PagingAndSortingRepository<House, Long>, JpaSpecificationExecutor<House> {



}
