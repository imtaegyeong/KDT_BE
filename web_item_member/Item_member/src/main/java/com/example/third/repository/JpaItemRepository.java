package com.example.third.repository;

import com.example.third.domain.Item;
import lombok.RequiredArgsConstructor;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//생성자 자동 생산
@RequiredArgsConstructor
public class JpaItemRepository implements ItemRepository{

  private final EntityManager em;


  @Override
  public Item save(Item item) {
    if(item.getId() == null) { //아이템이 신규 Entity일 경우
      em.persist(item); // 생성
    } else {
      em.merge(item); // 업데이트
    }
    return item;
  }

  @Override
  public Optional<Item> findById(Long id) {
    return Optional.ofNullable(em.find(Item.class, id));
  }

  @Override
  public List<Item> findAll() {
    return new ArrayList<>(em.createQuery("select i from Item i", Item.class).getResultList());
  }

  @Override
  public void update(Long id, Item item) {

  }
}
