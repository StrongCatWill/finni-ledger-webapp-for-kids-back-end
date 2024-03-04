package com.ledger.restcontroller;

import com.nimbusds.oauth2.sdk.token.AccessToken;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TokenController {

    @ApiOperation(value = "토큰 발급", notes = "refresh token으로 access token을 발급받습니다.")
    @GetMapping("/api/auth/access-token/issue")
    public AccessToken issueAccessToekn(@ApiParam(value = "리프레시 토큰", required = true) @RequestParam String refreshToken) {
        return null;
    }

}
