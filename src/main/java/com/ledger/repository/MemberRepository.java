package com.ledger.repository;

import com.ledger.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
    /*
    처음 가입하는 사용자인지 판단하는 메소드
    소셜 로그인으로 반환되는 값 중 email을 통해 이미 생성된 사용자인지
    * */
    public List<Member> findByEmail(String email);



}
