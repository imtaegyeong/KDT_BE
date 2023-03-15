package hellojpa;

import domain.Member;
import domain.MemberO;
import domain.MemberType;
import domain.Team;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class HelloJpa_MemberO_Team {

  public static void main(String[] args) {
    //EMF는 스프링이 만들어 주지만, 지금은 순수한 자바코드로 작업중이라 직접 만듬
    //persistenceUnitName은 persistence.xml의  <persistence-unit name="hello">과 동일해야한다.
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
    EntityManager em = emf.createEntityManager();

    EntityTransaction tx = em.getTransaction();
    tx.begin();

    try {
      //create team
      Team team = em.find(Team.class, 1L);
//      team.setName("teamA");
//      em.persist(team);

      Team team2 = em.find(Team.class, 2L);
//      team.setName("teamB");
//      em.persist(team);

      //create member
      MemberO member1 = new MemberO("test4", MemberType.GENERAL);
      MemberO member2 = new MemberO("test5", MemberType.GENERAL);
      MemberO member3 = new MemberO("test6", MemberType.GENERAL);

      member1.setTeam(team);
      member2.setTeam(team2);
      member3.setTeam(team);

      em.persist(member1);
      em.persist(member2);
      em.persist(member3);


      System.out.println("영속상태 =======");

//      MemberO findMember1 = em.find(MemberO.class, member1.getId());
//      Team findTeam = em.find(Team.class, 1L);


//      System.out.println("1차 캐시 findMember1 = " + findMember1);
//      System.out.println("findTeam = " + findTeam);
      System.out.println("커밋전 !!!");
      tx.commit();
      System.out.println("커밋후 !!!");
    } catch (Exception e) {
      System.out.println(e.getMessage());
      tx.rollback();
    } finally {
      em.close();
    }
    emf.close();
  }
}
