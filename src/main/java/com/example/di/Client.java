package com.example.di;

import java.util.List;

public class Client {
    public static void main(String[] args) {

        MemberService memberService = new NewMemberService();
        MemberController controller = new MemberController(memberService);
        List<Member> memberList = controller.getMember();
    }
}
