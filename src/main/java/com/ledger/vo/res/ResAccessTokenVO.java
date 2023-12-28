package com.ledger.vo.res;

import lombok.Data;

@Data
public class ResAccessTokenVO {
    private String accessToken;
    private String accessTokenExpireTime;
    private String grantType;
    private String refreshToken;
    private String refreshTokenExpireTime;
}
