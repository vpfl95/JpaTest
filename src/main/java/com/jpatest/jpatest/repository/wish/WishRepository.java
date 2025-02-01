package com.jpatest.jpatest.repository.wish;

import com.jpatest.jpatest.entity.Wish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface WishRepository extends JpaRepository<Wish, Long>, WishRepositoryCustom {


    @Query("SELECT w FROM Wish w JOIN FETCH w.member m JOIN FETCH w.houseDeal h JOIN FETCH h.houseInfo WHERE m.memberName = :memberName")
//@Query("SELECT w FROM Wish w JOIN FETCH w.member m JOIN FETCH w.houseDeal h  WHERE m.memberName = :memberName")
    List<Wish> findByMemberName(@Param("memberName") String memberName);
}
