package com.example.third.interceptor;

import com.example.third.controller.session.SessionConst;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.UUID;

@Slf4j
public class LoginCheckInterceptor implements HandlerInterceptor {

  //로그인 실패 시 진행하지 않고 종료

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    String requestURI = request.getRequestURI();
    String uuid = UUID.randomUUID().toString();
    HttpSession session = request.getSession(false);

    if (session != null && session.getAttribute(SessionConst.NAME) != null){
      log.info("loginCheck-preHandle / {}, [{}], {}", requestURI, uuid, session.getAttribute(SessionConst.NAME));
      return true;
    }
    log.error("loginCheck-preHandle / 미인증 사용자의 접근");
    response.sendRedirect("/login?redirectURL="+requestURI);
    return false;
  }
}
