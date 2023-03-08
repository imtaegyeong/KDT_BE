package com.example.second.repository;

import com.example.second.domain.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.*;

class MemoryMemberRepositoryTest {
  MemoryMemberRepository memberRepository = new MemoryMemberRepository();

  @BeforeEach
  void repositoryClear() {
    memberRepository.clear();
  }

  @Test
  void save() {
    //given
    Member member = new Member();
    member.setName("hong");
    //when
    memberRepository.save(member);
    //then
    Optional<Member> findMember = memberRepository.findByName(member.getName());
    //    Assertions.assertEquals(member, findMember);
    assertThat(findMember.get()).isEqualTo(member);
  }

  @Test
  void findById() {
    //given
    Member member = new Member();
    member.setName("hong");
    memberRepository.save(member);
    //when
    Optional<Member> findMember = memberRepository.findById(member.getId());

    //then
    assertThat(findMember.get().getId()).isEqualTo(member.getId());
  }

  @Test
  void findByName() {
    Member member = new Member();
    member.setName("hong");
    memberRepository.save(member);

    Optional<Member> findMember = memberRepository.findByName(member.getName());

    assertThat(findMember.get().getName()).isEqualTo(member.getName());
  }

  @Test
  void findAll() {
    //given
    Member member1 = new Member();
    member1.setName("hong");
    memberRepository.save(member1);

    Member member2 = new Member();
    member2.setName("kong");
    memberRepository.save(member2);
    //when
    List<Member> memberList = memberRepository.findAll();
    //then
    assertThat(memberList.size()).isEqualTo(2);
  }
}