package com.jpatest.jpatest.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "dongcode")
public class DongCode {

    @Id
    @Column(name = "dongCode")
    private String dongcode;

    @Column(name = "sido")
    private String sido;

    @Column(name = "sigungu")
    private String sigungu;

    @Column(name = "emd")
    private String emd;

    @Column(name = "lee")
    private String lee;

    @Column(name = "lat")
    private String lat;

    @Column(name = "lng")
    private String lng;

    @Override
    public String toString() {
        return "DongCode{" +
                "dongcode='" + dongcode + '\'' +
                ", sido='" + sido + '\'' +
                ", sigungu='" + sigungu + '\'' +
                ", emd='" + emd + '\'' +
                ", lee='" + lee + '\'' +
                ", lat='" + lat + '\'' +
                ", lng='" + lng + '\'' +
                '}';
    }
}
