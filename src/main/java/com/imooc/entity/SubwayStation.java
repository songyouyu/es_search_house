package com.imooc.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author youyusong
 * @date 2018/9/7
 */
@Data
@Entity
@Table(name = "subway_station")
public class SubwayStation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "subway_id")
    private Long subwayId;

    private String name;
}
