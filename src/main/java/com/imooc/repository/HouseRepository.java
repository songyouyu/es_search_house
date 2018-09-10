package com.imooc.repository;

import com.imooc.entity.House;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 * 房屋DAO(使用 PagingAndSortingRepository 做分页排序)
 * @author youyusong
 * @date 2018/9/6
 */
public interface HouseRepository extends PagingAndSortingRepository<House, Long>, JpaSpecificationExecutor<House> {

    @Modifying
    @Query("update House as house set house.cover = :cover where house.id = :id")
    void updateCover(@Param(value = "id") Long id, @Param(value = "cover") String cover);

    @Modifying
    @Query("update House as house set house.status = :status where house.id = :id")
    void updateStatus(@Param(value = "id") Long id, @Param(value = "status") int status);
}
