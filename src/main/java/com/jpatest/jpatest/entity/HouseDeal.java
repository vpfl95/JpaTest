package com.jpatest.jpatest.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "housedeal")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HouseDeal {


    @Id
    private Long no;

    @Column(name = "dealAmount")
    private String dealAmount;
    @Column(name = "dealYear")
    private Integer dealYear;
    @Column(name = "dealMonth")
    private Integer dealMonth;
    @Column(name = "dealDay")
    private Integer dealDay;
    @Column(name = "area")
    private String area;
    @Column(name = "floor")
    private String floor;
    @Column(name = "cancelDealType")
    private String cancelDealType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "aptCode")
    private HouseInfo houseInfo;

    @Override
    public String toString() {
        return "HouseDeal{" +
                "no=" + no +
                ", dealAmount='" + dealAmount + '\'' +
                ", dealYear=" + dealYear +
                ", dealMonth=" + dealMonth +
                ", dealDay=" + dealDay +
                ", area='" + area + '\'' +
                ", floor='" + floor + '\'' +
                ", cancelDealType='" + cancelDealType + '\'' +
                ", houseInfo=" + houseInfo +
                '}';
    }
}
