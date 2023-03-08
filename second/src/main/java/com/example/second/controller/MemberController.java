package com.example.second.controller;

import com.example.second.Service.MemberService;
import com.example.second.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//리퀘스트매핑을 통해 포함되는 겟매핑들의 공통된 주소를 묶을 수 있다.
@Controller
@RequestMapping("/member")
public class MemberController {

  private final MemberService memberService;

  @Autowired
  public MemberController(MemberService memberService) {
    this.memberService = memberService;
  }

  @GetMapping("/new")
  public String newMember() {
    return "member/new";
  }

  @PostMapping("/new")
  public String newMemberPost(MemberForm memberForm) {
    Member member = new Member();
    member.setName(memberForm.getName());
    memberService.join(member);
    return "redirect:/";
  }

  @GetMapping("/list")
  public String memberList(Model model) {
    model.addAttribute("members",memberService.findMembers());
    return "member/member";
  }
}
