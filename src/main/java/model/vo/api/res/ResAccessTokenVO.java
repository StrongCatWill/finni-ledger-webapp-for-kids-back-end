package model.vo.api.res;

import lombok.Data;

@Data
public class ResAccessTokenVO {

    private String accessToken;
    private String accessTokenExpireTime;
    private String grantType;
    private String refreshToken;
    private String refreshTokenExpireTime;

}
