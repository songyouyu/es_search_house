package com.imooc.dto;

import lombok.Data;

/**
 * 地铁站点DTO
 * @author youyusong
 * @date 2018/9/7
 */
@Data
public class SubwayStationDTO {

    private Long id;
    private Long subwayId;
    private String name;
}
