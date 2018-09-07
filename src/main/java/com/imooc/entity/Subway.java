package com.imooc.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author youyusong
 * @date 2018/9/7
 */
@Data
@Entity
@Table(name = "subway")
public class Subway {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "city_en_name")
    private String cityEnName;

}
