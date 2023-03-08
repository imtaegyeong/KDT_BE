package com.example.second;

import com.example.second.Service.MemberService;
import com.example.second.repository.JdbcTemplateMemberRepository;
import com.example.second.repository.JpaMemberRepository;
import com.example.second.repository.MemberRepository;
import com.example.second.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import javax.swing.text.html.parser.Entity;

@Configuration
public class SpringConfig {

  private final DataSource dataSource;
  private final EntityManager em;

  @Autowired
  public SpringConfig(DataSource dataSource, EntityManager em) {
    this.dataSource = dataSource;
    this.em = em;
  }

  @Bean
  public MemberService memberService(){
    return new MemberService(memberRepository());
  }

  @Bean
  public MemberRepository memberRepository(){
    //    return new MemoryMemberRepository();
    //    return new JdbcTemplateMemberRepository(dataSource);
    return new JpaMemberRepository(em);
  }
}
