package com.example.di;

import java.util.List;

public class MemberController {
    //
    private MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    public List<Member> getMember(){
        return memberService.getMemberList();
    }
}
