package com.imooc.dto;

import lombok.Data;

/**
 * 房屋详情DTO
 * @author youyusong
 * @date 2018/9/6
 */
@Data
public class HouseDetailDTO {

    private String description;

    private String layoutDesc;

    private String traffic;

    private String roundService;

    private Integer rentWay;

    private Long adminId;

    private String address;

    private Long subwayLineId;

    private Long subwayStationId;

    private String subwayLineName;

    private String subwayStationName;

}
