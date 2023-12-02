package com.ledger.controller;

import com.ledger.entity.Member;
import com.ledger.response.MyPage;
import com.ledger.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class MyPageController {

    private final MemberService memberService;

    /*
     * test -- myPage flow 1 구현
     * todo : 회원 세션 -> 마이페이지 진입 체크 로직 추가
     * */
    @RequestMapping(value = "members/selectOne/{id}", method = RequestMethod.GET)
    public String myPage(@PathVariable(value = "id", required = true) Long id, Model model) {
        try {
            Member findMember = memberService.findOne(id);

            //생성자 패턴 사용
            MyPage myPage = new MyPage(
                    findMember.getId(),
                    findMember.getProfile(),
                    findMember.getNickname(),
                    findMember.getAge(),
                    findMember.getEmail(),
                    findMember.getRole()
            );

            model.addAttribute("myPage", myPage);

            return "members/mypage/myPage";
        } catch (Exception exception) {
            return "/home";
        }
    }

    /*
    * update 창
    * todo : 모달로 변경하기(웹앱으로 변경)
    * */
    @GetMapping("/members/mypage/updateMemberForm/{id}")
    public String updateMemberForm(@PathVariable("id") Long memberId, Model model){

        Member member = memberService.findOne(memberId);
        MyPage myPageModify = new MyPage();

        myPageModify.setProfile(member.getProfile());
        myPageModify.setName(member.getNickname());
        model.addAttribute("myPageModify", myPageModify);

        return "members/mypage/updateMemberForm";
    }

    /*
     * test --createMember
     * todo : 소셜 로그인 기능으로 변경하기, method 삭제 요청
     * */
    @PostMapping("/members/mypage/updateMember/{id}")
    public String updateMember(@ModelAttribute MyPage form, @PathVariable Long memberId) {

        memberService.updateMember(memberId, form.getName(), form.getProfile(), form.getAge());
        return "/home";
    }

}
