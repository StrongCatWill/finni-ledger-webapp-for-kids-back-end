package com.ledger.constant;

import lombok.Getter;
import org.springframework.http.HttpMethod;


@Getter
public enum CallAPI {

    TOKEN_LOGIN                                 ("/api/auth/login", "로그인, 토큰 발급", HttpMethod.POST),
    TOKEN_LOGOUT                                ("/api/auth/logout", "로그아웃, 토큰 만료 API", HttpMethod.POST),
    TOKEN_REFRESH                               ("/api/auth/access-token/issue", "토큰 재발급", HttpMethod.POST);

    private final String url;
    private final String desc;
    private final HttpMethod httpMethod;

    CallAPI(String url, String desc, HttpMethod httpMethod) {
        this.url = url;
        this.desc = desc;
        this.httpMethod = httpMethod;
    }
}
