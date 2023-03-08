package com.example.second.repository;

import com.example.second.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public interface MemberRepository {

  Member save(Member member);

  Optional<Member> findById(Long id); // optional 수정할 예정

  Optional<Member> findByName(String name); // optional 수정할 예정

  List<Member> findAll();
}
