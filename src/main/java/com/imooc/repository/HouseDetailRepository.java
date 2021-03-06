package com.imooc.repository;

import com.imooc.entity.HouseDetail;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * 房屋详情DAO
 * @author youyusong
 * @date 2018/9/6
 */
public interface HouseDetailRepository extends CrudRepository<HouseDetail, Long> {


    HouseDetail findByHouseId(Long id);

    List<HouseDetail> findAllByHouseIdIn(List<Long> houseIds);
}
