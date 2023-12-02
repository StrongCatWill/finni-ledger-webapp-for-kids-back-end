package com.ledger.response;

import com.ledger.constant.Profile;
import com.ledger.constant.Role;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/*
* 테스트용 회원 가입용 폼 -> 회원 정보 조회로 들어가기 위해서.
* */
@Getter @Setter
public class ResCreateMemberForm {

    private String name;

    private int age;

    private String email;

    private Profile profile;

    private Role role;

    private LocalDateTime regTime;
}
