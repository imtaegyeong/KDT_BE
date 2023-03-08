package com.example.first.repository;

import com.example.first.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository {
  private static Map<Long, Member> map = new HashMap<>();
  private static long nextId = 1L;

  public Member save(Member member) {
    member.setId(nextId++);
    map.put(nextId, member);
    return member;
  }

  public Member findById(long id) {
    return map.get(id);
  }

  public List<Member> findAll() {
    List<Member> members = new ArrayList<>(map.values());
    System.out.println(members.toString());
    return members;
  }
}
