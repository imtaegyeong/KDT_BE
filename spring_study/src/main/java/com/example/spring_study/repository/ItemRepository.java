package com.example.spring_study.repository;

import com.example.spring_study.domain.Item;

public interface ItemRepository {
    public Item save(Item item);

    public Item findById(Long id);

    public Item findAll();

    public void update(Long id, Item item);
}
