package com.jpatest.jpatest.repository.wish;

import com.jpatest.jpatest.entity.Wish;

import java.util.List;

public interface WishRepositoryCustom {
    List<Wish> findWishesByMemberName(String memberName);
}
