package com.example.first.service;

import com.example.first.domain.Member;
import com.example.first.repository.JdbcTemplateMemberRepository;
import com.example.first.repository.MemberRepository;
import com.example.first.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;

@Service
public class MemberService {
  //  MemoryMemberRepository memberRepository = new MemoryMemberRepository();
   private final MemberRepository memberRepository;

  @Autowired
  public MemberService(MemberRepository memberRepository) {
    this.memberRepository = memberRepository;
  }

  public long join(Member member) {
    return memberRepository.save(member).getId();
  }

  public List<Member> memberList() {
    return memberRepository.findAll();
  }

  public Member findMember(long id) {
    return memberRepository.findById(id);
  }
}
