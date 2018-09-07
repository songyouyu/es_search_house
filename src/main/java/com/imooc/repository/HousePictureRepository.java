package com.imooc.repository;

import com.imooc.entity.HousePicture;
import org.springframework.data.repository.CrudRepository;

/**
 * 房屋图片DAO
 * @author youyusong
 * @date 2018/9/6
 */
public interface HousePictureRepository extends CrudRepository<HousePicture, Long> {
}
