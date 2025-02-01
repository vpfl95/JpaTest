package com.jpatest.jpatest.member;

import com.jpatest.jpatest.entity.Member;
import com.jpatest.jpatest.repository.member.MemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@SpringBootTest
public class MemberTest {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    @DisplayName("멤버 생성")
    @Transactional
    void save(){
        Member member = Member.builder().memberName("member").build();
        memberRepository.save(member);
        Assertions.assertThat(memberRepository.findAll()).hasSize(11);
    }

    @Test
    @DisplayName("멤버 조회")
    @Transactional
    void findMember(){
        Optional<Member> findMember = memberRepository.findById(1L);

        Assertions.assertThat(findMember).isPresent();
    }






}
