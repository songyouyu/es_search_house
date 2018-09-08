package com.imooc.repository;

import com.imooc.entity.SubwayStation;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * 地铁站DTO
 * @author youyusong
 * @date 2018/9/7
 */
public interface SubwayStationRepository extends CrudRepository<SubwayStation, Long> {

    List<SubwayStation> findAllBySubwayId(Long subwayId);
}

