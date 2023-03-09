package com.example.third.controller;

import com.example.third.domain.Member;
import com.example.third.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("/members")
public class MemberController {

    MemberService memberService;

    MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/join")
    public String memberJoin(Model model) {
        Member member =new Member();
        model.addAttribute("Member", member);
        return "/members/join";
    }

    @PostMapping("/join")
    public String memberJoin(@ModelAttribute Member member) {
        memberService.join(member);
        return "redirect:/";
    }

    @GetMapping("/login")
    public String memberLogin(Model model){
        Member member =new Member();
        model.addAttribute("Member", member);
        return "members/login";
    }

    @PostMapping("/login")
    public String memberLogin(@ModelAttribute Member member){
        Optional<Member> member1 = memberService.findMember(member.getLoginId());
        //        String pw = memberService.findMember(member.getLoginId()).get().getPassword();
        // empty 체크 안하면 no such Element Exception 발생
        if( !member1.isEmpty() && member1.get().getPassword().equals(member.getPassword())) {
            return "basic/items";
        }
        return "redirect:/members/login";

    }

}
