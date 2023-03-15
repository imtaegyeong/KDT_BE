package hellojpa;

import domain.Member;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HelloJpa_update {

  public static void main(String[] args) {
    //EMF는 스프링이 만들어 주지만, 지금은 순수한 자바코드로 작업중이라 직접 만듬
    //persistenceUnitName은 persistence.xml의  <persistence-unit name="hello">과 동일해야한다.
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
    EntityManager em = emf.createEntityManager();

    EntityTransaction tx = em.getTransaction();


    try {
      tx.begin();
      Member m1 = em.find(Member.class, 1L);

      String before = m1.username;
      System.out.println("before = " + before);
      m1.username ="jpa updated";

      //업데이트 머지 같은 코드가 없어도 DB에 변경된 값을 저장할수 잇음

      System.out.println("영속상태  =========");
      System.out.println("커밋 전 =========");
      tx.commit();
      System.out.println("커밋 후 =========");

      System.out.println("m1 = " + m1);
      System.out.println("em find =========");
      Member m2 = em.find(Member.class, 1L);
    } catch (Exception e) {
      System.out.println(e.getMessage());
      tx.rollback();
    } finally {
      em.close();
    }
    emf.close();
  }
}
