package hellojpa;

import domain.Member;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HelloJpa_remove {

  public static void main(String[] args) {
    //EMF는 스프링이 만들어 주지만, 지금은 순수한 자바코드로 작업중이라 직접 만듬
    //persistenceUnitName은 persistence.xml의  <persistence-unit name="hello">과 동일해야한다.
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
    EntityManager em = emf.createEntityManager();

    EntityTransaction tx = em.getTransaction();


    try {
      tx.begin();
      Member m1 = em.find(Member.class, 1L);
      System.out.println("영속상태 ===========");
      em.remove(m1);
      System.out.println("리무브 상태 !!!");
      tx.commit();
      System.out.println("커밋 상태 !!!");
      tx.begin();
      em.persist(m1);
      System.out.println("커밋 후 다시 펄시스트 !!!");
      tx.commit();
      System.out.println("다시 커밋 !!!");
    } catch (Exception e) {
      System.out.println(e.getMessage());
      tx.rollback();
    } finally {
      em.close();
    }
    emf.close();
  }
}
