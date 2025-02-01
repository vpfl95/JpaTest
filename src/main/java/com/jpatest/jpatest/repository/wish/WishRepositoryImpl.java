package com.jpatest.jpatest.repository.wish;

import com.jpatest.jpatest.entity.*;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class WishRepositoryImpl implements WishRepositoryCustom{

    private final JPAQueryFactory queryFactory;

    @Override
    public List<Wish> findWishesByMemberName(String memberName) {
        QWish wish = QWish.wish;
        QMember member = QMember.member;
        QHouseDeal houseDeal = QHouseDeal.houseDeal;
        QHouseInfo houseInfo = QHouseInfo.houseInfo;

        return queryFactory
                .selectFrom(wish)
                .join(wish.member, member).fetchJoin()
                .join(wish.houseDeal,houseDeal).fetchJoin()
                .join(houseDeal.houseInfo,houseInfo).fetchJoin()
                .where(member.memberName.eq(memberName))
                .distinct()
                .fetch();


    }
}
