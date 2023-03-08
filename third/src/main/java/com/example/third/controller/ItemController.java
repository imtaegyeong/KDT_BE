package com.example.third.controller;

import com.example.third.domain.Item;
import com.example.third.service.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/basic")
public class ItemController {

  private final ItemService is;

  public ItemController(ItemService is) {
    this.is = is;
  }

  @GetMapping("/items")
  public String items(Model model){
    model.addAttribute("items", is.allItems());
    return "basic/items";
  }

  @GetMapping("/item/{id}")
  public String item(@PathVariable Long id, Model model){
    Item item = is.findItemById(id).get();
    model.addAttribute(item);
    return "basic/item";
  }

  @GetMapping("/edit{id}")
  public String edit(@PathVariable Long id, Model model){
    Item item = is.findItemById(id).get();
    model.addAttribute(item);
    return "basic/editForm";
  }

  @GetMapping("/add")
  public String add(){
    return "basic/addForm";
  }
}
