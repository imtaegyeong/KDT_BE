package hellojpa;

import domain.MemberO;
import domain.MemberType;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HelloJpa_MemberO {

  public static void main(String[] args) {
    //EMF는 스프링이 만들어 주지만, 지금은 순수한 자바코드로 작업중이라 직접 만듬
    //persistenceUnitName은 persistence.xml의  <persistence-unit name="hello">과 동일해야한다.
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
    EntityManager em = emf.createEntityManager();

    EntityTransaction tx = em.getTransaction();
    tx.begin();

    try {
      MemberO member1 = new MemberO("test3", MemberType.GENERAL);
      MemberO member2 = new MemberO("test4", MemberType.MANAGER);
      MemberO member3 = new MemberO("test5", MemberType.EXECUTIVE);


      System.out.println("비영속상태 =======");
      em.persist(member1);
      em.persist(member2);
      em.persist(member3);
      System.out.println("영속상태 =======");
      MemberO findMember1 = em.find(MemberO.class, member1.getId());
      MemberO findMember2 = em.find(MemberO.class, member2.getId());
      MemberO findMember3 = em.find(MemberO.class, member3.getId());
      System.out.println("1차 캐시 findMember1 = " + findMember1);
      System.out.println("1차 캐시 findMember2 = " + findMember2);
      System.out.println("1차 캐시 findMember3 = " + findMember3);
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
