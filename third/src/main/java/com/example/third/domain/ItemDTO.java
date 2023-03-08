package com.example.third.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ItemDTO {
  //DTO를 통해 데이터 입력 로직을 관리 (범위 등)
  //도메인에 바로 넣으면 외부에서 접근할 위험이 있다.
  private Long id;
  private String itemName;
  private Integer price;
  private Integer quantity;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }
}
