package com.ledger.response;

import com.ledger.constant.Profile;
import com.ledger.constant.Role;
import lombok.Getter;
import lombok.Setter;

/*
note : VM
* myPage 회원 정보 화면
* myPage 회원 정보 수정
* */
@Getter @Setter
public class MyPage {

    private Long memberId;

    private Profile profile;

    private String name;

    private Integer age;

    private String email;

    private Role role;

    public MyPage() {
    }

    public MyPage(Long memberId, Profile profile, String name, Integer age, String email, Role role) {
        this.memberId = memberId;
        this.profile = profile;
        this.name = name;
        this.age = age;
        this.email = email;
        this.role = role;
    }
}
