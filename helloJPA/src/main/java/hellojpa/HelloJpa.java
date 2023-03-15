package hellojpa;

import domain.Member;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HelloJpa {

  public static void main(String[] args) {
    //EMF는 스프링이 만들어 주지만, 지금은 순수한 자바코드로 작업중이라 직접 만듬
    //persistenceUnitName은 persistence.xml의  <persistence-unit name="hello">과 동일해야한다.
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
    EntityManager em = emf.createEntityManager();

    EntityTransaction tx = em.getTransaction();
    tx.begin();

    try {
      Member member = new Member();
      member.username="aaa";

//      Member member2 = new Member();
//      member2.id = 2L;
//      member2.username="bbb";

      System.out.println("비영속상태 =======");
      em.persist(member);
//      em.persist(member2);

      Member findMember = em.find(Member.class, 1L);
//      Member findMember2 = em.find(Member.class, 1L);
//      System.out.println("findMember == findMember2? " + (findMember==findMember2));
      System.out.println("persist 이후 =======");
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
