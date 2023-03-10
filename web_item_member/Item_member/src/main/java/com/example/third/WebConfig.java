package com.example.third;

import com.example.third.filter.LogFilter;
import com.example.third.filter.LoginCheckFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

@Configuration
public class WebConfig {
  @Bean
  public FilterRegistrationBean LogFilter() { // 필터간의 순서 등록, 어느 부분에 적용할지
    FilterRegistrationBean<Filter> filterFilterRegistrationBean = new FilterRegistrationBean<>();
    filterFilterRegistrationBean.setFilter(new LogFilter()); // 어느 필터 사용할지 결정
    filterFilterRegistrationBean.setOrder(1); // 순서 적용
    filterFilterRegistrationBean.addUrlPatterns("/*"); //어느 부분에 적용할지 /* -> 모든 부분에 적용
    return filterFilterRegistrationBean;
  }

  @Bean
  public FilterRegistrationBean loginCheckFilter() {
    FilterRegistrationBean<Filter> filterFilterRegistrationBean = new FilterRegistrationBean<>();
    filterFilterRegistrationBean.setFilter(new LoginCheckFilter());
    filterFilterRegistrationBean.setOrder(2);
    filterFilterRegistrationBean.addUrlPatterns("/*");
    return filterFilterRegistrationBean;
  }
}
