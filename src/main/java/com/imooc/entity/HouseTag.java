package com.imooc.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * 房屋标签映射关系
 * @author youyusong
 * @date 2018/9/6
 */
@Data
@Entity
@Table(name = "house_tag")
public class HouseTag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "house_id")
    private Long houseId;

    private String name;

    public HouseTag() {
    }

    public HouseTag(Long houseId, String name) {
        this.houseId = houseId;
        this.name = name;
    }

}
