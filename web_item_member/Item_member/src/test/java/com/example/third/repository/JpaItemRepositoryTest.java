package com.example.third.repository;

import com.example.third.domain.Item;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class JpaItemRepositoryTest {

  EntityManager em;
  ItemRepository itemRepository;

  public JpaItemRepositoryTest(EntityManager em, ItemRepository itemRepository) {
    this.em = em;
    this.itemRepository = itemRepository;
  }

  @Test
  void save() {
    //given
    Item item = new Item("itemA", 1000, 100);
    //when
    Item save = itemRepository.save(item);
    System.out.println("save = " + save + " : " + save.getClass());;
    //then
    Item find = itemRepository.findById(save.getId()).get();
    System.out.println("find = " + find + " : " + find.getClass());
    assertThat(find).isEqualTo(save);
  }
}