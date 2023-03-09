package com.example.spring_study.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {
    private Long id;
    private String itemName;
    private Integer price;
    private Integer qty;
}
