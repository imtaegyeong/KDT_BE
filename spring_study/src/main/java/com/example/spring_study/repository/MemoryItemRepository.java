package com.example.spring_study.repository;

import com.example.spring_study.domain.Item;

public class MemoryItemRepository implements ItemRepository{
    @Override
    public Item save(Item item) {
        return null;
    }

    @Override
    public Item findById(Long id) {
        return null;
    }

    @Override
    public Item findAll() {
        return null;
    }

    @Override
    public void update(Long id, Item item) {

    }
}
