package com.example.coocakiefe.member.service;


import com.example.coocakiefe.member.dto.Member;
import com.example.coocakiefe.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MemberService {

    @Autowired
    MemberRepository mr;

    public int signup(Member member){
        return mr.signup(member);
    }

    public Member login(Member member){
        return mr.login(member);
    }


}
