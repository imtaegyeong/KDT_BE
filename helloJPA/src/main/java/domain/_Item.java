package domain;

import javax.persistence.*;

@Entity
public class _Item {

  @Id
  @Column(name = "item_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private int price;
  private int qty;

  public _Item(String name, int price, int qty) {
    this.name = name;
    this.price = price;
    this.qty = qty;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getQty() {
    return qty;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }
}
