package com.imooc.dto;

import lombok.Data;

/**
 * @author youyusong
 * @date 2018/10/5
 */
@Data
public class HouseBucketDTO {

    /**
     * 聚合bucket的key
     */
    private String key;

    /**
     * 聚合结果值
     */
    private Long count;

    public HouseBucketDTO(String key, long count) {
        this.key = key;
        this.count = count;
    }
}
