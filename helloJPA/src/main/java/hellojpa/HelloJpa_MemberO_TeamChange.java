package hellojpa;

import domain.MemberO;
import domain.Team;

import javax.persistence.*;
import java.util.List;

public class HelloJpa_MemberO_TeamChange {

  public static void main(String[] args) {
    //EMF는 스프링이 만들어 주지만, 지금은 순수한 자바코드로 작업중이라 직접 만듬
    //persistenceUnitName은 persistence.xml의  <persistence-unit name="hello">과 동일해야한다.
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
    EntityManager em = emf.createEntityManager();

    EntityTransaction tx = em.getTransaction();
    tx.begin();

    try {
      //find team
      Team team = em.find(Team.class, 2L);
      Team team2 = em.find(Team.class, 1L);

      //find member
      List<MemberO> allMember = em.createQuery("select  m from MemberO as m", MemberO.class).getResultList();
      System.out.println("전체 멤버 조회");
      for (MemberO memberO : allMember) {
        System.out.println("memberO = " + memberO);
      }
      System.out.println("====================================");

      System.out.println("멤버 팀 변경");
      List<MemberO> resultList = em
          .createQuery("select m from MemberO as m where team_id = :teamId", MemberO.class)
          .setParameter("teamId", team.getId())
          .getResultList();

      for (MemberO memberO : resultList) {
        memberO.setTeam(team2);
      }
      System.out.println("====================================");

      System.out.println("전체 멤버 조회");
      for (MemberO memberO : allMember) {
        System.out.println("memberO = " + memberO);
      }


      System.out.println("커밋전 !!!");
      //커밋 하면서 변경된 내용이 DB에 적용된다.
      tx.commit();
      System.out.println("커밋후 !!!");

//      System.out.println("영속상태 =======");

//      MemberO findMember1 = em.find(MemberO.class, member1.getId());
//      Team findTeam = em.find(Team.class, 1L);


//      System.out.println("1차 캐시 findMember1 = " + findMember1);
//      System.out.println("findTeam = " + findTeam);

    } catch (Exception e) {
      System.out.println(e.getMessage());
      tx.rollback();
    } finally {
      em.close();
    }
    emf.close();
  }
}
