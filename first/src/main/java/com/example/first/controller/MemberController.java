package com.example.first.controller;

import com.example.first.domain.Member;
import com.example.first.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MemberController {

  private final MemberService memberService;

  @Autowired
  public MemberController(MemberService memberService) {
    this.memberService = memberService;
  }



  @GetMapping("/member/home")
  public String home(){
    return "member/home";
  }

  @GetMapping("/member/new")
  public String newMember() {
    return "member/newMember";
  }

  @PostMapping("/member/new")
  public String newMember(MemberForm memberForm) {
    //form에서 데이터를 던질 때 매개변수의 타입과 동일한 이름의 클레스의 setter를 찾아서 실행
    Member member = new Member();
    member.setName(memberForm.getName());
    System.out.println(memberForm.getEmail());
    System.out.println(memberForm.getName());
    System.out.println(memberService.join(member) + "번 사용자 가입 완료");
    return "member/home";
  }

//  @GetMapping("/members")
//  @ResponseBody
//  public List<Member> memberList(Model model){
//    List<Member> members = memberService.memberList();
//    model.addAttribute("members", members);
//    return members;

    @GetMapping("/members")
    public String memberList(Model model){
      List<Member> members = memberService.memberList();
      model.addAttribute("members", members);
      return "member/memberlist";
  }
}
