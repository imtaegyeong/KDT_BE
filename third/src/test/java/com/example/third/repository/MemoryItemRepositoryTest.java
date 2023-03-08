package com.example.third.repository;

import com.example.third.domain.Item;
import com.example.third.domain.ItemDTO;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MemoryItemRepositoryTest {

  MemoryItemRepository itemRepository = new MemoryItemRepository();

  @Test
  @DisplayName("상품 저장")
  void 저장() {
    //g
    Item item = new Item("딱풀",500,1);
    //w
    Item saveItem = itemRepository.save(item);
    //t
    Item findItem = itemRepository.findById(saveItem.getId()).get();
    assertThat(saveItem).isEqualTo(findItem);
  }

  @Test
  void findAll() {
    Item item1 = new Item("1", 500, 1);
    Item item2 = new Item("2", 200, 2);
    itemRepository.save(item1);
    itemRepository.save(item2);

    List<Item> list= itemRepository.findAll();

    assertThat(list).hasSize(2);
  }

  @Test
  void update() {
    Item item = new Item("딱풀", 500, 1);
    Item past = itemRepository.save(item);

    Item find = new Item("딱풀2", 1000, 3);
    itemRepository.update(past.getId(), find);

    Item result = itemRepository.findById(past.getId()).get();
    assertThat(result.getItemName()).isEqualTo(find.getItemName());
    assertThat(result.getPrice()).isEqualTo(find.getPrice());
    assertThat(result.getQuantity()).isEqualTo(find.getQuantity());
    assertThat(result.getId()).isEqualTo(past.getId());
  }
}