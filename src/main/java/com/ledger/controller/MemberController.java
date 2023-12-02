package com.ledger.controller;

import com.ledger.entity.Member;
import com.ledger.repository.MemberRepository;
import com.ledger.response.ResCreateMemberForm;
import com.ledger.response.MyPage;
import com.ledger.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;
    private final MemberRepository memberRepository;

    /*
     * test -> main
     * */
    @GetMapping("/home")
    public String createMember() {
        return "/home";
    }


    /*
     * test -> new Member form
     * todo : 소셜 로그인 메서드와 smart merge 필요
     * */
    @GetMapping("/members/new")
    public String createForm(Model model) {
        model.addAttribute("memberForm", new ResCreateMemberForm());
        return "members/mypage/createMemberForm";
    }

    /*
     * test --createMember
     * todo : 소셜 로그인 기능으로 변경하기, method 삭제 요청
     * */
    @PostMapping("/members/new")
    public String create(MyPage form) {
        Member member = new Member();

        member.setNickname(form.getName());
        member.setAge(form.getAge());
        member.setEmail(form.getEmail());
        member.setRole(form.getRole());
        member.setProfile(form.getProfile());
        member.setRegTime(LocalDateTime.now());

        memberService.join(member);

        return "/home";
    }

    /*
     * test - member list
     * */
    @GetMapping("members")
    public String memberList(Model model) {
        List<Member> members;
        model.addAttribute("members", memberService.findMember());
        return "members/mypage/memberList";
    }


}
