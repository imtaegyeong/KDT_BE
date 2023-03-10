package com.example.firstSelf.Service;

import com.example.firstSelf.Domain.Member;
import com.example.firstSelf.Repository.MemberRepository;

import java.util.List;

public class MemberService {

  MemberRepository memberRepository = new MemberRepository();

  public Member join(Member member) {
    return memberRepository.saveMember(member);
  }

  public String findMember(String name) {
    return memberRepository.findById(name);
  }

  public List findAll() {
    return memberRepository.findAll();
  }
}
