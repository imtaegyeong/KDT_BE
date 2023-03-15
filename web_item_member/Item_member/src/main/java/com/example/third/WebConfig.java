package com.example.third;

import com.example.third.filter.LogFilter;
import com.example.third.filter.LoginCheckFilter;
import com.example.third.interceptor.LogInterceptor;
import com.example.third.interceptor.LoginCheckInterceptor;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.Filter;

@Configuration
public class WebConfig implements WebMvcConfigurer {

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(new LogInterceptor())
        .order(1)
        .addPathPatterns("/**") //  모두 적용 /**
        .excludePathPatterns("/css/**", "/", "/favicon.ico", "/error"); //예외 부분 추가

    registry.addInterceptor(new LoginCheckInterceptor())
        .order(2)
        .addPathPatterns("/**")
        .excludePathPatterns("/css/**", "/", "/favicon.ico", "/error", "/login", "/members/join", "/logout");

    //권한 체크를 통해 특정 페이지는 자격 있는 유저만 들어갈 수 있도록
  }

  //  @Bean
  public FilterRegistrationBean LogFilter() { // 필터간의 순서 등록, 어느 부분에 적용할지
    FilterRegistrationBean<Filter> filterFilterRegistrationBean = new FilterRegistrationBean<>();
    filterFilterRegistrationBean.setFilter(new LogFilter()); // 어느 필터 사용할지 결정
    filterFilterRegistrationBean.setOrder(1); // 순서 적용
    filterFilterRegistrationBean.addUrlPatterns("/*"); //어느 부분에 적용할지 /* -> 모든 부분에 적용
    return filterFilterRegistrationBean;
  }

  //  @Bean
  public FilterRegistrationBean loginCheckFilter() {
    FilterRegistrationBean<Filter> filterFilterRegistrationBean = new FilterRegistrationBean<>();
    filterFilterRegistrationBean.setFilter(new LoginCheckFilter());
    filterFilterRegistrationBean.setOrder(2);
    filterFilterRegistrationBean.addUrlPatterns("/*");
    return filterFilterRegistrationBean;
  }
}
