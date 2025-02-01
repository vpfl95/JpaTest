package com.jpatest.jpatest.houseinfo;

import com.jpatest.jpatest.entity.HouseInfo;
import com.jpatest.jpatest.repository.houseinfo.HouseInfoRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
class HouseInfoTest {

    @Autowired
    private HouseInfoRepository houseInfoRepository;

    @Test
    @DisplayName("전체 매물 정보 조회")
    void searchHouseInfo() {
        List<HouseInfo> all = houseInfoRepository.findAll();
        Assertions.assertThat(all).hasSize(42233);
    }

    @Test
    @DisplayName("행정동별 매물 정보 조회")
    void searchHouseInfoByDong(){
        List<HouseInfo> dong = houseInfoRepository.findByDong("역삼동");
        dong.forEach(System.out::println);
    }

    @Test
    @DisplayName("아파트별 매매 정보 조회")
    @Transactional
    void searchHouseDealByApart(){
        HouseInfo houseInfo = houseInfoRepository.findByApartmentName("브라운스톤역삼");
        houseInfo.getHouseDeals().forEach(System.out::println);
    }



}