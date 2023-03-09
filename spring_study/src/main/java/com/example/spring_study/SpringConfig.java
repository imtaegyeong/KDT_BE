package com.example.spring_study;

import com.example.spring_study.repository.MemberRepository;
import com.example.spring_study.repository.JpaMemberRepository;
import com.example.spring_study.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
public class SpringConfig {

  private final EntityManager em;
  private final DataSource dataSource;

  public SpringConfig(EntityManager em, DataSource dataSource) {
    this.em = em;
    this.dataSource = dataSource;
  }

  @Bean
  public MemberService memberService() {
    return new MemberService(memberRepository());
  }

  @Bean
  public MemberRepository memberRepository() {
    return new JpaMemberRepository(em);
  }
}
