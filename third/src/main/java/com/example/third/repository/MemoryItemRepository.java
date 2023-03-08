package com.example.third.repository;

import com.example.third.domain.Item;
import com.example.third.domain.ItemDTO;

import java.util.*;

public class MemoryItemRepository implements ItemRepository{

  private static final Map<Long, Item> store = new HashMap<>();
  private static Long seq = 0L;

  @Override
  public Item save(Item item) {
    item.setId(++seq);
    store.put(item.getId(), item);
    return item;
  }

  @Override
  public Optional<Item> findById(Long id) {
    return Optional.ofNullable(store.get(id));
  }

  @Override
  public List<Item> findAll() {
    return new ArrayList<>(store.values());
  }

  @Override
  public void update(Long id, Item item) {
    Item temp = findById(id).get();
    temp.setPrice(item.getPrice());
    temp.setItemName(item.getItemName());
    temp.setQuantity(item.getQuantity());
    //put 자체에 업데이트 기능이 존재함 (key가 존재하면 value만 변경)
    store.put(id, temp);
  }
}
