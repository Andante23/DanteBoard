package com.example.danteBoard.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Member {  // 데이터베이스 테이블이 된다. 
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;  // 회원 여러명 

    @Column(unique = true)
    public String username;
    public String password;
}
