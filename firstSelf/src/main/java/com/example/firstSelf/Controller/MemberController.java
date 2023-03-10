package com.example.firstSelf.Controller;

import com.example.firstSelf.Domain.Member;
import com.example.firstSelf.Service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MemberController {

  MemberService ms = new MemberService();

  @GetMapping("/join")
  public String memberJoin(){
    return "Join";
  }

  @PostMapping("/join")
  public String memberJoin(MemberForm memberForm){
    Member member = new Member();
    member.setMail(memberForm.getMail());
    System.out.println("포스트 멤버폼 유저아이디" + memberForm.getMail());
    System.out.println("포스트 멤버 유저아이디" + member.getMail());
    member.setName(memberForm.getName());
    ms.join(member);
    return "main";
  }

  @GetMapping("/find")
  public String memberFind(){
    return "find";
  }

  @PostMapping("/find")
  public String memberFind(Model model){
    String name = (String)model.getAttribute("name");
    model.addAttribute("mail",ms.findMember(name));
    return "result";
  }

  @GetMapping("members")
  @ResponseBody
  public List<Member> members(Model model) {
    return ms.findAll();
  }

}
