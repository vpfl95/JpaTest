package com.jpatest.jpatest.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "member")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long member_id;

    @Column(name="memberName")
    private String memberName;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<Wish> wishList = new ArrayList<>();

    @Override
    public String toString() {
        return "Member{" +
                "member_id=" + member_id +
                ", memberName='" + memberName + '\'' +
                '}';
    }
}
