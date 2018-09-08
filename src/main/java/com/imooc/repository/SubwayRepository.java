package com.imooc.repository;

import com.imooc.entity.Subway;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * 地铁DAO
 * @author youyusong
 * @date 2018/9/7
 */
public interface SubwayRepository extends CrudRepository<Subway, Long> {

    List<Subway> findAllByCityEnName(String cityEnName);

}
