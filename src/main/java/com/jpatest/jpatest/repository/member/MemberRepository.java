package com.jpatest.jpatest.repository.member;

import com.jpatest.jpatest.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
