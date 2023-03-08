package com.example.second.Service;

import com.example.second.domain.Member;
import com.example.second.repository.MemberRepository;
import com.example.second.repository.MemoryMemberRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
@Transactional // save update delete --> commit // rollback --> commit 데이터를 이전으로 되돌려줌
class MemberServiceIntegrationTest {

  MemberService memberService;
  MemberRepository memberRepository;

  @Autowired
  public MemberServiceIntegrationTest(MemberService ms, MemberRepository mr) {
    this.memberService = ms;
    this.memberRepository = mr;
  }

  @Test
  void join_Test() throws Exception {
    //given
    Member member = new Member();
    member.setName("hong");
    //when
    memberService.join(member);
    //then
    Optional<Member> findMember = memberRepository.findById(member.getId());
    assertThat(findMember.get().getName()).isEqualTo(member.getName());
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

