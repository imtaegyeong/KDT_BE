package com.example.third.filter;

import com.example.third.controller.session.SessionConst;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.PatternMatchUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.UUID;

@Slf4j
public class LoginCheckFilter implements Filter {

  //모든 범위에 적용 X 특정 범위에만 적용
  //특정 사이트는 적용 X -> 화이트 리스트(로그인 회원가입 로그아웃)

  private static final String[] whiteList = {"/", "/login", "/members/join", "/logout", "/css/*"};

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    HttpServletRequest httpRequest = (HttpServletRequest) request;
    HttpServletResponse httpResponse = (HttpServletResponse) response;

    String requestURI = httpRequest.getRequestURI();
    String uuid = UUID.randomUUID().toString();

    try {
      log.info("로그인 인증 필터 시작 : [{}], [{}]", requestURI, uuid);

      if(!PatternMatchUtils.simpleMatch(whiteList, requestURI)) {
        HttpSession session = httpRequest.getSession(false);
        if(session == null || session.getAttribute(SessionConst.NAME) == null) {
          log.info("미 인증 사용자의 요청 {}", requestURI);
          httpResponse.sendRedirect("/login?redirectURL="+requestURI);
          return;
        }
      }
      chain.doFilter(request, response);
    } catch (Exception e) {
      throw e;
    } finally {
      log.info("로그인 인증 필터 종료 : [{}], [{}]", requestURI, uuid);
    }
  }
}

