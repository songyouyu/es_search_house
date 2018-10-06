package com.imooc.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author youyusong
 * @date 2018/10/6
 */
@Data
public class HouseSubscribeDTO {

    private Long id;

    private Long houseId;

    private Long userId;

    private Long adminId;

    /**
     * 预约状态 1-加入待看清单 2-已预约看房时间 3-看房完成
     */
    private Integer status;

    private Date createTime;

    private Date lastUpdateTime;

    private Date orderTime;

    private String telephone;

    private String desc;

}
