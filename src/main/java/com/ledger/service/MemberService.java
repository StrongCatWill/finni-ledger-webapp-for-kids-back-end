package com.ledger.service;

import com.ledger.constant.Profile;
import com.ledger.entity.Member;
import com.ledger.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    /*
     * join member(test용도)
     * */
    @Transactional
    public String join(Member member) {
        validateDuplicateMember(member);
        memberRepository.save(member);
        return member.getEmail();
    }

    /*
    * test -- validate member
    * todo : social login 세션 만료됐을 때, 회원가입 시도 시 해당 메서드 사용하여 validate 진행
    *  mark : 계속 필요한 로직이므로 삭제하지 않을 것.
    * */
    private void validateDuplicateMember(Member member) {
        List<Member> findMembers = memberRepository.findByEmail(member.getEmail());
        if(!findMembers.isEmpty()){
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }
    }

    /*
     * test -- member list
     * */
    public List<Member> findMember() {
        return memberRepository.findAll();
    }

    /*
    * myPage 진입
    * todo : member 클릭 -> login session 조회
    * */
    public Member findOne(Long memberId) {
        return memberRepository.findById(memberId).orElse(null);
    }

    /*
    myPage -> Member update
    * */
    @Transactional
    public void updateMember(Long memberId, String name, Profile profile, int age) {

        Member findMember = findOne(memberId);

        findMember.setNickname(name);
        findMember.setAge(age);
        findMember.setProfile(profile);
    }
}
