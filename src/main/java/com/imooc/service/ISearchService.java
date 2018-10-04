package com.imooc.service;

import com.imooc.base.ServiceMultiResult;
import com.imooc.base.ServiceResult;
import com.imooc.form.RentSearch;

import java.util.List;

/**
 * 检索接口
 * @author youyusong
 * @date 2018/9/24
 */
public interface ISearchService {

    /**
     * 索引目标房源
     * @param houseId
     */
    void index(Long houseId);

    /**
     * 移除房源索引
     * @param houseId
     */
    void remove(Long houseId);

    /**
     * 查询房源接口
     * @param rentSearch
     * @return
     */
    ServiceMultiResult<Long> query(RentSearch rentSearch);

    /**
     * 获取补全建议关键词
     */
    ServiceResult<List<String>> suggest(String prefix);

    /**
     * 聚合特定小区的房间数
     */
    ServiceResult<Long> aggregateDistrictHouse(String cityEnName, String regionEnName, String district);
}
