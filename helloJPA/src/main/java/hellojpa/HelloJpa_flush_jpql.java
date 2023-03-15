package hellojpa;

import domain.Member;
import org.hibernate.annotations.common.reflection.XMember;

import javax.persistence.*;
import java.util.List;

public class HelloJpa_flush_jpql {

  public static void main(String[] args) {
    //EMF는 스프링이 만들어 주지만, 지금은 순수한 자바코드로 작업중이라 직접 만듬
    //persistenceUnitName은 persistence.xml의  <persistence-unit name="hello">과 동일해야한다.
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
    EntityManager em = emf.createEntityManager();

    EntityTransaction tx = em.getTransaction();


    try {
      tx.begin();

      Member m1 = new Member( "test1");
      Member m2 = new Member( "test2");
      Member m3 = new Member( "test3");
      em.persist(m1);
      em.persist(m2);
      em.persist(m3);
      System.out.println("영속상태  =========");

      em.setFlushMode(FlushModeType.COMMIT);
      em.setFlushMode(FlushModeType.AUTO);

      List<Member> resultList = em
          .createQuery("select m from Member as m where id > :id", Member.class)
          .setParameter("id", 300L)
          .setFirstResult(1)
          .setMaxResults(3)
          .getResultList();
      for (Member member : resultList) {
        System.out.println("member = " + member);
      }

      System.out.println("커밋 전 =========");
      tx.commit();
      System.out.println("커밋 후 =========");

    } catch (Exception e) {
      System.out.println(e.getMessage());
      tx.rollback();
    } finally {
      em.close();
    }
    emf.close();
  }
}
