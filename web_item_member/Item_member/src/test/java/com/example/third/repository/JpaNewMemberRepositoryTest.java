package com.example.third.repository;

import com.example.third.domain.NewMember;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class JpaNewMemberRepositoryTest{

  final EntityManager em;

  @Autowired
  public JpaNewMemberRepositoryTest(EntityManager em) {
    this.em = em;
  }

  @Test
  void 동일_트랜젝션_동일_엔티티_테스트() {
    NewMember member = new NewMember();
    String id = "1";
    NewMember m1 = em.find(NewMember.class, id);
    NewMember m2 = em.find(NewMember.class, id);

    assertThat(m1).isSameAs(m2);
  }
}