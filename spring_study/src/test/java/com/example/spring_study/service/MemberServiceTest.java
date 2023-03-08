package com.example.spring_study.service;

import com.example.spring_study.domain.Member;
import com.example.spring_study.repository.MemoryMemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

  MemberService ms;
  MemoryMemberRepository memberRepository;

  @BeforeEach
  public void beforeEach(){
    memberRepository = new MemoryMemberRepository();
    ms = new MemberService(memberRepository);
  }

  @AfterEach
  public void afterEach() {
    memberRepository.clearStore();
  }

  @Test
  void 회원가입() {
    //given
    Member member = new Member();
    member.setName("spring");
    //when
    Long result = ms.join(member);

    //then
    Member findMember = ms.findOne(result).get();
    assertThat(member.getName()).isEqualTo(findMember.getName());
  }

  @Test
  void 중복검사() {
    //given
    Member member1 = new Member();
    member1.setName("spring");

    Member member2 = new Member();
    member2.setName("spring");

    //when
    ms.join(member1);
    IllegalStateException e = assertThrows(IllegalStateException.class, () -> ms.join(member2));
    assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");

    //then
  }


  @Test
  void 전체검색() {
  }

  @Test
  void 한명찾기() {
  }
}