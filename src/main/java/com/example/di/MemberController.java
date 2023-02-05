package com.example.di;

import java.util.List;

public class MemberController {
    //
    private NewMemberService memberService;

    public MemberController(NewMemberService memberService) {
        this.memberService = memberService;
    }

    public List<Member> getMember(){
        return memberService.getMemberList();
    }
}
