package com.imooc.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author youyusong
 * @date 2018/9/6
 */
@Data
public class HousePictureDTO {

    private Long id;

    @JsonProperty(value = "house_id")
    private Long houseId;

    private String path;

    @JsonProperty(value = "cdn_prefix")
    private String cdnPrefix;

    private Integer width;

    private Integer height;

}
