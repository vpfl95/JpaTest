package com.jpatest.jpatest.wish;

import com.jpatest.jpatest.entity.HouseDeal;
import com.jpatest.jpatest.entity.Member;
import com.jpatest.jpatest.entity.Wish;
import com.jpatest.jpatest.repository.housedeal.HouseDealRepository;
import com.jpatest.jpatest.repository.member.MemberRepository;
import com.jpatest.jpatest.repository.wish.WishRepository;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@Slf4j
class WishTest {

    @Autowired
    private WishRepository wishRepository;
    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private HouseDealRepository houseDealRepository;




    @Test
    @DisplayName("관심매물 등록")
    @Transactional
//    @Rollback(false)
    void saveWish(){
        Member member = memberRepository.findById(1L).orElseThrow(NullPointerException::new);
        HouseDeal houseDeal = houseDealRepository.findById(111101501000005L).orElseThrow(NullPointerException::new);

        Wish wish = Wish.builder().member(member).houseDeal(houseDeal).build();
        log.info("wish {}", wish.toString());
        Wish savedWish = wishRepository.save(wish);
        log.info("savedWish: {}", savedWish);

        Wish findWish = wishRepository.findById(savedWish.getWish_id()).orElseThrow(NullPointerException::new);
        Assertions.assertThat(findWish).isEqualTo(savedWish);
    }


    @Test
    @DisplayName("관심매물 조회")
    @Transactional
    void findBymember(){


        List<Wish> wishes = wishRepository.findByMemberName("member1");
        System.out.println("lazy 발생하기전");

        wishes.forEach(System.out::println);
        System.out.println("프린트하려고 조회할 때 lazy 발생한 후");
//        log.info("wishes {}", wishes);
    }


}