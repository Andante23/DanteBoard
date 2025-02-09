package com.example.danteBoard.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.danteBoard.Repository.MemberRepository;


import lombok.RequiredArgsConstructor;



@Service
@RequiredArgsConstructor
public class MyUserDetailService implements UserDetailsService {


    private final MemberRepository memberRepository;
    
    @Override

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    

    
        var result = memberRepository.findByUsername(username);
        if(result.isEmpty()){
            // 유저아이디 없어
            // throw 
        }

        var user = result.get();
        List<GrantedAuthority> 권한 = new ArrayList<>();
        권한.add(new SimpleGrantedAuthority(username));


        return new User(user.getUsername(), user.getPassword() , 권한);

    }
}
