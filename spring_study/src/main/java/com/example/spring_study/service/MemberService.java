package com.example.spring_study.service;

import com.example.spring_study.domain.Member;
import com.example.spring_study.repository.MemberRepository;

import java.util.List;
import java.util.Optional;

public class MemberService {

  private final MemberRepository memberRepository;

  public MemberService(MemberRepository memberRepository) {
    this.memberRepository = memberRepository;
  }

  public Long join(Member member) {
    //중복체크
      validateDuplicateMember(member);
    memberRepository.save(member);
    return member.getId();
  }

  public List<Member> findMembers(){
    return memberRepository.findALl();
  }

  public Optional<Member> findByName(String name){
    return memberRepository.findByName(name);
  }

  public Optional<Member> findById(Long id){
    return memberRepository.findById(id);
  }


  private void validateDuplicateMember(Member member) {
    memberRepository.findByName(member.getLoginId()).ifPresent(m -> {
      throw new IllegalStateException("이미 존재하는 아이디입니다.");
    });
  }
}
