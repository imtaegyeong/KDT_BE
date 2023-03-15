package com.example.third.repository;

import com.example.third.domain.Member;
import com.example.third.domain.NewMember;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class JpaNewMemberRepository{
    private final EntityManager em;

    public JpaNewMemberRepository(EntityManager em) {
        this.em = em;
    }

    public String save() {
        NewMember member = new NewMember();
        member.id = "4";
        em.persist(member);
        return member.id;
    }
}
