package com.imooc.dto;

import lombok.Data;

/**
 * @author youyusong
 * @date 2018/9/15
 */
@Data
public class UserDTO {

    private Long id;
    private String name;
    private String avatar;
    private String phoneNumber;
    private String lastLoginTime;
}
