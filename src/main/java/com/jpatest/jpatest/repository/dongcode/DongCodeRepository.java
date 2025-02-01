package com.jpatest.jpatest.repository.dongcode;

import com.jpatest.jpatest.entity.DongCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DongCodeRepository extends JpaRepository<DongCode, String> {
    @Query("SELECT e FROM DongCode e WHERE e.sido IS NOT NULL AND e.sido <> ''")
    List<DongCode> findValidSido();

    @Query("SELECT e FROM DongCode e WHERE e.sigungu IS NOT NULL AND e.sigungu <> ''")
    List<DongCode> findValidSigungu();

    @Query("SELECT e FROM DongCode e WHERE e.emd IS NOT NULL AND e.emd <> ''")
    List<DongCode> findValidEmd();
}
