package com.example.third.controller;

import com.example.third.controller.session.CookieConst;
import com.example.third.controller.session.MemberSession;
import com.example.third.controller.session.SessionConst;
import com.example.third.domain.Member;
import com.example.third.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.*;
import java.util.Map;
import java.util.Optional;

@Controller
public class LoginController {

  MemberService memberService;

  @Autowired
  public LoginController(MemberService memberService) {
    this.memberService = memberService;
  }

  @GetMapping("/login")
  public String memberLogin(Model model){
    Member member =new Member();
    model.addAttribute("Member", member);
    return "/login";
  }

  @PostMapping("/login")
  public String memberLogin(@ModelAttribute Member member,
                            //                            HttpServletResponse response,
                            HttpServletRequest request,
                            @RequestParam(defaultValue = "/") String redirectURL){
    //        String pw = memberService.findMember(member.getLoginId()).get().getPassword();
    // empty 체크 안하면 no such Element Exception 발생
    Optional<Member> member1 = memberService.findMember(member.getLoginId());

    if( !member1.isEmpty() && member1.get().getPassword().equals(member.getPassword())) {
      Member loginMember = member1.get();

      MemberSession memberSession = new MemberSession();
      memberSession.setId(loginMember.getId());
      memberSession.setLoginId(loginMember.getLoginId());
      memberSession.setName(loginMember.getName());

      HttpSession session = request.getSession(true);// true : if null -> create
      session.setAttribute(SessionConst.NAME, memberSession);

//      Cookie memberId = new Cookie(CookieConst.NAME, String.valueOf(member1.get().getId()));
//      response.addCookie(memberId);

      //미인증 사용자가 로그인 성공하면 이전에 요청 왔던 페이지로 이동
      return "redirect:" + redirectURL;
    }
    return "redirect:/login";
  }

  @PostMapping("/logout")
  public String memberLogout(
    //      HttpServletResponse response
    HttpServletRequest request) {

    HttpSession session = request.getSession(false);
    if(session != null) {
      session.invalidate();
    }
    //    Cookie cookie = new Cookie(CookieConst.NAME, null);
    //    cookie.setMaxAge(0);
    //    response.addCookie(cookie);
    return "redirect:/";
  }


}
