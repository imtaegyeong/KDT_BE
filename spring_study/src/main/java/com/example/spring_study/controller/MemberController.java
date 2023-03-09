package com.example.spring_study.controller;

import com.example.spring_study.domain.Member;
import com.example.spring_study.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {

  private final MemberService memberService;

  @Autowired
  public MemberController(MemberService memberService) {
    this.memberService = memberService;
  }

  @GetMapping("/join")
  public String join() {
    return "join";
  }

  @GetMapping("/login")
  public String login() {
    return "login";
  }
}
