package com.jpatest.jpatest.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "houseinfo")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class HouseInfo {

    @Id
    @Column(name = "aptCode")
    private Long aptCode;

    @Column(name = "buildYear")
    private Integer buildYear;
    @Column(name = "roadName")
    private String roadName;
    @Column(name = "roadnameBonbun")
    private String roadnameBonbun;
    @Column(name = "roadNameSeq")
    private String roadSeq;
    @Column(name = "roadNameBubun")
    private String roadBubun;
    @Column(name = "roadNameBasementCode")
    private String roadBasementCode;
    @Column(name = "roadNameCode")
    private String roadNameCode;
    @Column(name = "dong")
    private String dong;
    @Column(name = "bonbun")
    private String bonbun;
    @Column(name = "bubun")
    private String bubun;
    @Column(name = "sigunguCode")
    private String siginguCode;
    @Column(name = "eubmyundongCode")
    private String eubmyundongCode;
    @Column(name = "landCode")
    private String landCode;
    @Column(name = "apartmentName")
    private String apartmentName;
    @Column(name = "jibun")
    private String jibun;
    @Column(name = "lng")
    private String lng;
    @Column(name = "lat")
    private String lat;

    @OneToMany(mappedBy = "houseInfo")
    private List<HouseDeal> houseDeals = new ArrayList<>();

    @Override
    public String toString() {
        return "HouseInfo{" +
                "lat='" + lat + '\'' +
                ", lng='" + lng + '\'' +
                ", jibun='" + jibun + '\'' +
                ", apartmentName='" + apartmentName + '\'' +
                ", landCode='" + landCode + '\'' +
                ", eubmyundongCode='" + eubmyundongCode + '\'' +
                ", siginguCode='" + siginguCode + '\'' +
                ", bubun='" + bubun + '\'' +
                ", bonbun='" + bonbun + '\'' +
                ", dong='" + dong + '\'' +
                ", roadNameCode='" + roadNameCode + '\'' +
                ", roadBasementCode='" + roadBasementCode + '\'' +
                ", roadBubun='" + roadBubun + '\'' +
                ", roadSeq='" + roadSeq + '\'' +
                ", roadnameBonbun='" + roadnameBonbun + '\'' +
                ", roadName='" + roadName + '\'' +
                ", buildYear=" + buildYear +
                ", aptCode=" + aptCode +
                '}';
    }
}
