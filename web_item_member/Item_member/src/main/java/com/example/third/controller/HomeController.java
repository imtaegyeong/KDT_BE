package com.example.third.controller;

import com.example.third.controller.session.CookieConst;
import com.example.third.controller.session.MemberSession;
import com.example.third.controller.session.SessionConst;
import com.example.third.domain.Member;
import com.example.third.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Slf4j
@Controller
public class HomeController {

    MemberService ms;

    public HomeController(MemberService ms) {
        this.ms = ms;
    }

    @GetMapping("/")
    public String home(
        HttpServletRequest request,
//        @CookieValue(value = CookieConst.NAME, required = false ) Long memberId,
        Model model) {
        HttpSession session = request.getSession(false);// false로 가져오면 없을 경우 null을 반환한다. 있으면 그 값 반환


        log.info("member id : [ {} ]", session);
        //로그인 안한 사람은 home
        if(session == null) {
            return "home";
        }
        //로그인 한 사람은 loginHome으로
        else{
            MemberSession memberSession = (MemberSession) session.getAttribute(SessionConst.NAME);
//            Member member = ms.findMemberById(memberId).get();
            model.addAttribute("member", memberSession);
            return "loginHome";
        }

    }
}
