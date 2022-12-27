package com.example.coocakiefe.member.controller;

import com.example.coocakiefe.member.dto.Member;
import com.example.coocakiefe.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

public class LoginController {

    @Autowired
    MemberService ms;

    @PostMapping("/signup")
    public int signup(Member member){
        return ms.signup(member);
    }

    @PostMapping("/login")
    public Member login(Member member, HttpSession session){

        Member loginMember = ms.login(member);
        if(loginMember != null){
            session.setAttribute("id", loginMember);
            return loginMember;
        }
        return null;
    }

    @PostMapping("/logout")
    public String logout(HttpSession session){
        if(session.getAttribute("id") != null){
            session.setAttribute("id", null);
            return "success";
        } else {
            return "failed";
        }
    }
}
