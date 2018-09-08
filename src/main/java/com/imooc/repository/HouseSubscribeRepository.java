package com.imooc.repository;

import com.imooc.entity.HouseSubscribe;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * 房屋描述DAO
 * @author youyusong
 * @date 2018/9/7
 */
public interface HouseSubscribeRepository extends PagingAndSortingRepository<HouseSubscribe, Long> {
}
