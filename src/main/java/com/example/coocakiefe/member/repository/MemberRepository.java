package com.example.coocakiefe.member.repository;

import com.example.coocakiefe.mapper.MemberMapper;
import com.example.coocakiefe.member.dto.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {

    @Autowired
    MemberMapper mapper;

    public int signup(Member member){
        return mapper.signup(member);
    }

    public Member login(Member member){
        return mapper.login(member);
    }


}
