package com.jpatest.jpatest.repository.houseinfo;

import com.jpatest.jpatest.entity.HouseInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HouseInfoRepository extends JpaRepository<HouseInfo, Long> {
    List<HouseInfo> findByDong(String dong);
    HouseInfo findByApartmentName(String apartmentName);
}
