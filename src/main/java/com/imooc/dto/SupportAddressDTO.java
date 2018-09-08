package com.imooc.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 支持区域DTO
 * @author youyusong
 * @date 2018/9/6
 */
@Data
public class SupportAddressDTO {

    private Long id;
    @JsonProperty(value = "belong_to")
    private String belongTo;

    @JsonProperty(value = "en_name")
    private String enName;

    @JsonProperty(value = "cn_name")
    private String cnName;

    private String level;

    private Double baiduMapLongitude;

    private Double baiduMapLatitude;

}
