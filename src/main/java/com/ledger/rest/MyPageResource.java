package com.ledger.rest;

import com.ledger.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MyPageResource {

    private final MemberService memberService;






}
