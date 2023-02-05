package com.example.di;

import java.util.List;

public class NewMemberService implements MemberService {
    @Override
    public List<Member> getMemberList() {
        return List.of(
                new Member(1L, "hong", 23)
        );
    }
}
