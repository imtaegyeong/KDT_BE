package com.example.third.service;

import com.example.third.domain.Item;
import com.example.third.domain.ItemDTO;
import com.example.third.repository.ItemRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ItemService {

  private final ItemRepository itemRepository;

  public ItemService(ItemRepository itemRepository) {
    this.itemRepository = itemRepository;
  }

  public Long addItem(ItemDTO itemDto) {
    Item item = new Item(itemDto.getItemName(), itemDto.getPrice(), itemDto.getQuantity());
    return itemRepository.save(item).getId();
  }

  public List<Item> allItems() {
    return itemRepository.findAll();
  }

  public Optional<Item> findItemById(Long id) {
    return itemRepository.findById(id);
  }

  public void updateItem(Long id, ItemDTO itemDto) {
    Item item = new Item(itemDto.getItemName(), itemDto.getPrice(), itemDto.getQuantity());
    itemRepository.update(id, item);
  }
}
