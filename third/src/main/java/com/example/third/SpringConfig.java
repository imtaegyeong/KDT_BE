package com.example.third;

import com.example.third.repository.ItemRepository;
import com.example.third.repository.MemoryItemRepository;
import com.example.third.service.ItemService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
  //테스트중
  //하나더
  @Bean
  public ItemService itemService(){
    return new ItemService(itemRepository());
  }

  @Bean
  public ItemRepository itemRepository(){
    return new MemoryItemRepository();
  }
}
