package com.example.third.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

@Slf4j
public class LogInterceptor implements HandlerInterceptor {
  @Override
  public boolean preHandle(HttpServletRequest request,
                           HttpServletResponse response,
                           Object handler) throws Exception {

    String requestURI = request.getRequestURI();
    String uuid = UUID.randomUUID().toString();

    //pre post after 단계에서 각 요청별로 구분하기 위해서
    request.setAttribute("uuid", uuid);

    log.info("(preHandle) requestURI, UUID : {} , [ {} ], {}", requestURI, uuid, handler);

    return true; // true -> 다음 컨트롤러 호출, false -> 종료
  }

  @Override
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    //getAttribute -> return object ->toString or downCasting
    String uuid = request.getAttribute("uuid").toString();
    log.info("(postHandle) UUID, handler, modelAndView : [ {} ] , {}, {}", uuid, handler, modelAndView);
  }

  @Override
  public void afterCompletion(HttpServletRequest request,
                              HttpServletResponse response,
                              Object handler,
                              Exception ex) throws Exception {
    String requestURI = request.getRequestURI();
    String uuid = request.getAttribute("uuid").toString();

    log.info("(afterCompletion) requestURI, UUID, handler : {} , [ {} ], {}", requestURI, uuid, handler);

    if( ex != null)
      log.error("(afterCompletion) error", ex);
  }
}
