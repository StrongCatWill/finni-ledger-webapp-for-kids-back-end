package com.ledger.service;

import com.ledger.config.PasswordEncoderConfig;
import com.ledger.entity.Member;
import com.ledger.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

    protected Logger log = LoggerFactory.getLogger(this.getClass());

    private final MemberRepository memberRepository;

    private final PasswordEncoderConfig passwordEncoderConfig;



    public Member findByEmail(String userEmail) {
        return memberRepository.findByEmail(userEmail).orElse(null);
    }

    public Member findMemberById(Long memberId) {
        return memberRepository.findById(memberId).orElse(null);
    }

    /*
    * 회원 정보 업데이트
    * */
    @Transactional
    public void update(Member member) {
        String encodedPassword = passwordEncoderConfig.encodePassword().encode(member.getPassword());
        member.setPassword(encodedPassword);
        memberRepository.save(member);
    }

    /*
    * 회원 탈퇴
    * */
    @Transactional
    public void delteMember(Long memberId) {
        Member memberById = findMemberById(memberId);
        memberRepository.delete(memberById);
    }



}
