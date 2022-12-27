package com.example.coocakiefe.mapper;

import com.example.coocakiefe.member.dto.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    public int signup(Member member);

    public Member login(Member member);

}
