package com.example.second.repository;

import com.example.second.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.*;

public class MemoryMemberRepository implements MemberRepository{

  private static Map<Long, Member> map = new HashMap<>();

  private static long seq = 0L;

  @Override
  public Member save(Member member) {
    member.setId(++seq);
    map.put(seq, member);
    return member;
  }

  @Override
  public Optional<Member> findById(Long id) {
    return Optional.ofNullable(map.get(id));
  }

  @Override
  public Optional<Member> findByName(String name) {
    Optional<Member> any = map.values().stream()
                            .filter(member -> member.getName().equals(name))
                            .findAny();
    return any;
  }

  @Override
  public List<Member> findAll() {
    return new ArrayList<Member>(map.values());
  }

  public void clear() {
    map.clear();
  }
}
