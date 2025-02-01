package com.jpatest.jpatest.dongcode;

import com.jpatest.jpatest.entity.DongCode;
import com.jpatest.jpatest.repository.dongcode.DongCodeRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DongCodeTest {

    @Autowired
    DongCodeRepository dongCodeRepository;

    @Test
    @DisplayName("시도 이름 조회")
    void searchSido(){
        List<DongCode> validSido = dongCodeRepository.findValidSido();
        validSido.forEach(System.out::println);
    }

    @Test
    @DisplayName("시군구 이름 조회")
    void searchSigungu(){
        List<DongCode> validSigungu = dongCodeRepository.findValidSigungu();
        validSigungu.forEach(System.out::println);
    }

    @Test
    @DisplayName("읍면동 조회")
    void searchEmd(){
        List<DongCode> validEmd = dongCodeRepository.findValidEmd();
        Assertions.assertThat(validEmd).hasSize(18673);
    }



}