package com.example.firstSelf.Repository;

import com.example.firstSelf.Domain.Member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberRepository {
  static Map<Long, Member> mm = new HashMap<>();
  static Long memberCnt = 1L;

  public Member saveMember(Member member) {
    member.setNumber(memberCnt++);
    mm.put(memberCnt, member);
    return member;
  }

  public String findById(String name) {
    for(int i = 0; i < mm.size(); i++) {
      if(mm.get(i).getName().equals(name)){
        return mm.get(i).getMail();
      }
    }

    return "Wrong name";
  }

  public List<Member> findAll() {
    return new ArrayList<>(mm.values());
  }
}
