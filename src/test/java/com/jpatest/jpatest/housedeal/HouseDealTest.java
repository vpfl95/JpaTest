package com.jpatest.jpatest.housedeal;

import com.jpatest.jpatest.entity.HouseDeal;
import com.jpatest.jpatest.repository.housedeal.HouseDealRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class HouseDealTest {

    @Autowired
    private HouseDealRepository houseDealRepository;

    @Test
    @DisplayName("전체 매매 정보 조회")
    void searchHouseInfo() {
        List<HouseDeal> all = houseDealRepository.findAll();
        Assertions.assertThat(all).hasSize(4472301);
    }


}