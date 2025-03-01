package com.example.danteBoard.Repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.danteBoard.entity.Member;

public interface MemberRepository extends JpaRepository<Member , Long> {
    Optional<Member> findByUsername(String username);
}
