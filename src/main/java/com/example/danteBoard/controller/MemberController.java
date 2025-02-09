package com.example.danteBoard.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.danteBoard.Repository.MemberRepository;
import com.example.danteBoard.entity.Member;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;




@Controller
@RequiredArgsConstructor
public class MemberController {
    
private final MemberRepository memberRepository;


@GetMapping("/register")
public String register(){
    return "register";
}


@PostMapping("/member")
public String addMember(String username , String password) {
    
         Member member =  new Member();

        
         member.setUsername(username);
         var hash = new BCryptPasswordEncoder().encode(password);
         member.setPassword(hash);
         memberRepository.save(member);

         return "redirect:/login";
}



}
