package hellojpa;

import domain.Member;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HelloJpa_autoincre {

  public static void main(String[] args) {
    //EMF는 스프링이 만들어 주지만, 지금은 순수한 자바코드로 작업중이라 직접 만듬
    //persistenceUnitName은 persistence.xml의  <persistence-unit name="hello">과 동일해야한다.
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
    EntityManager em = emf.createEntityManager();

    EntityTransaction tx = em.getTransaction();
    tx.begin();

    try {
      Member member = new Member("test1");
      Member member2 = new Member("test2");
      Member member3 = new Member("test3");
//      System.out.println("member = " + member);
      System.out.println("비영속상태 =======");
      em.persist(member);
      System.out.println("1영속상태  =======");
      em.persist(member2);
      System.out.println("2영속상태  =======");
      em.persist(member3);
      System.out.println("3영속상태  =======");
//      Member fm1 = em.find(Member.class, member.id);
//      System.out.println("fm1 = " + fm1);
      System.out.println("커밋전 !!!");
      tx.commit();
      System.out.println("커밋후 !!!");
//      Member fm2 = em.find(Member.class, member.id);
//      System.out.println("fm2 = " + fm2);
    } catch (Exception e) {
      System.out.println(e.getMessage());
      tx.rollback();
    } finally {
      em.close();
    }
    emf.close();
  }
}
