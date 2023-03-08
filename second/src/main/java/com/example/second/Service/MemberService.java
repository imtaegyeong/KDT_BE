package com.example.second.Service;

import com.example.second.domain.Member;
import com.example.second.repository.JdbcTemplateMemberRepository;
import com.example.second.repository.MemberRepository;
import com.example.second.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

//@Service
@Transactional
public class MemberService {
  private final MemberRepository memberRepository;

//  @Autowired
  public MemberService(MemberRepository memberRepository) {
    this.memberRepository = memberRepository;
  }

  /**
   * 회원 가입
   */

  public Long join(Member member) throws IllegalStateException {
    //중복 회원 존재 여부 검증
    validateDupMember(member);
    //회원 추가
    return memberRepository.save(member).getId();
  }

  private void validateDupMember(Member member) { //isPresent() optional 존재하면
    memberRepository.findByName(member.getName()).ifPresent(m -> {
      System.out.println("중복");
      throw new IllegalStateException("이미 존재하는 이름입니다.");
    });
  }

  public List<Member> findMembers() {
    return memberRepository.findAll();
  }

  public Optional<Member> findMemberById(Long id) {
    return memberRepository.findById(id);
  }

}
