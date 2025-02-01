package com.jpatest.jpatest.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "wish")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class Wish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wish_id")
    private Long wish_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "no")
    private HouseDeal houseDeal;

    @Override
    public String toString() {
        return "Wish{" +
                "wish_id=" + wish_id +
                ", member=" + this.getMember() +
                ", houseDeal=" + this.getHouseDeal() +
                '}';
    }
}
