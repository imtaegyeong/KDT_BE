package com.example.second.Service;

import com.example.second.domain.Member;
import com.example.second.repository.MemoryMemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

  MemberService memberService;
  MemoryMemberRepository memberRepository;

  @BeforeEach
  void setUP() {
    memberRepository = new MemoryMemberRepository();
    memberService = new MemberService(memberRepository);
  }

  @Test
  void join_Test() {
    //given
    Member member = new Member();
    member.setName("hong");
    //when
    memberService.join(member);
    //then
    Optional<Member> findMember = memberRepository.findById(member.getId());
    assertThat(findMember.get()).isEqualTo(member);
  }

  @Test
  void dump_Join_Test() {
    Member member = new Member();
    member.setName("hong");

    Member member1 = new Member();
    member1.setName("hong");

    memberService.join(member);

    IllegalStateException e = assertThrows(IllegalStateException.class,
        () -> memberService.join(member1));
    assertThat(e.getMessage()).isEqualTo("이미 존재하는 이름입니다.");
  }


  @Test
  void 전체_회원_목록_테스트(){
    //given
    Member member = new Member();
    member.setName("홍길동");

    Member member1 = new Member();
    member1.setName("김연아");
    //when
    memberService.join(member);
    memberService.join(member1);
    //then
    assertThat(memberRepository.findAll().size()).isEqualTo(2);
  }
}

