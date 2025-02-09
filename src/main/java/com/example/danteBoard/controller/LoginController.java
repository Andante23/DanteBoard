package com.example.danteBoard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.danteBoard.Repository.MemberRepository;

import lombok.RequiredArgsConstructor;



@Controller
@RequiredArgsConstructor
public class LoginController {

    
   private final MemberRepository memberRepository;


    @GetMapping("/login")
    public String login(){
      return "login";
    }


//   @PostMapping("/login")
//     public String loginSubmit(@RequestParam("username") String username,
//                                @RequestParam("password") String password) {
     
        
// }
}
