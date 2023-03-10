package com.example.third.service;

import com.example.third.domain.Item;
import com.example.third.domain.ItemDTO;
import com.example.third.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ItemService {

    private final ItemRepository itemRepository;

    //    @RequiredArgsConstructor가 대신 생성
    //    public ItemService(ItemRepository itemRepository) {
    //        this.itemRepository = itemRepository;
    //    }

    @Transactional(readOnly = false)
    public Long addItem(ItemDTO itemDTO) {
        Item item = new Item(itemDTO.getItemName(), itemDTO.getPrice(), itemDTO.getQuantity());
        return itemRepository.save(item).getId();
    }

    public List<Item> allItems(){
        return itemRepository.findAll();
    }

    public Optional<Item> findItemById(Long id){
        return itemRepository.findById(id);
    }

    @Transactional(readOnly = false)
    public void updateItem(Long id, ItemDTO itemDTO){
        Item item = itemRepository.findById(id).get();;
        item.setItemName(itemDTO.getItemName());
        item.setQuantity(itemDTO.getQuantity());
        item.setPrice(itemDTO.getPrice());
        itemRepository.update(id, item);
    }
}
