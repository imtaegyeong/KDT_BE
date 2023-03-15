package hellojpa;

import domain.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Date;

public class HelloJpa_order {

  public static void main(String[] args) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
    EntityManager em = emf.createEntityManager();

    EntityTransaction tx = em.getTransaction();
    tx.begin();

    _Member member = new _Member("name", "city","street", "zipcode");
    em.persist(member);

    _Item item1 = new _Item("Food1", 5000, 1);
    _Item item2 = new _Item("Food2", 7000, 2);
    _Item item3 = new _Item("Food3", 9000, 3);
    em.persist(item1);
    em.persist(item2);
    em.persist(item3);

    _Order order = new _Order(new Date(),_Status.GET, member);
    em.persist(order);

    _OrderItem orderItem = new _OrderItem(item1.getPrice(),3,order,item1);
    _OrderItem orderItem2 = new _OrderItem(item2.getPrice(),2,order,item1);
    _OrderItem orderItem3 = new _OrderItem(item3.getPrice(),1,order,item1);
    em.persist(orderItem);
    em.persist(orderItem2);
    em.persist(orderItem3);
    tx.commit();

    emf.close();


  }
}
