package com.example.spring_study.repository;

import com.example.spring_study.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import java.util.*;

public class JpaMemberRepository implements MemberRepository{

  private final EntityManager em;

  @Autowired
  public JpaMemberRepository(EntityManager em) {
    this.em = em;
  }

  @Override
  public Member save(Member member) {
    em.persist(member);
    return member;
  }

  @Override
  public Optional<Member> findById(Long id) {
    return Optional.ofNullable(em.find(Member.class, id));
  }

  @Override
  public Optional<Member> findByName(String name) {
    return em.createQuery("select m from Member m where name= :name", Member.class)
            .setParameter("name", name)
            .getResultList()
            .stream()
            .filter(m -> m.getName().equals(name))
            .findAny();
  }

  @Override
  public List<Member> findALl() {
    return em.createQuery("select m from Member m", Member.class).getResultList();
  }

}
