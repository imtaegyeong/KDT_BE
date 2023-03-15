package hellojpa;

import domain.Member;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HelloJpa_flush {

  public static void main(String[] args) {
    //EMF는 스프링이 만들어 주지만, 지금은 순수한 자바코드로 작업중이라 직접 만듬
    //persistenceUnitName은 persistence.xml의  <persistence-unit name="hello">과 동일해야한다.
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
    EntityManager em = emf.createEntityManager();

    EntityTransaction tx = em.getTransaction();


    try {
      tx.begin();

      Member m5 = new Member( "test2");
      em.persist(m5);
      System.out.println("영속상태  =========");

      em.flush();

      System.out.println("커밋 전 =========");
      tx.commit();
      System.out.println("커밋 후 =========");

      System.out.println("em find =========");
      Member m2 = em.find(Member.class, 200L);
      System.out.println("m2 = " + m2);
    } catch (Exception e) {
      System.out.println(e.getMessage());
      tx.rollback();
    } finally {
      em.close();
    }
    emf.close();
  }
}
