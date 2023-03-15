package domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class _OrderItem {

  @Id
  @Column(name = "orderitem_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Integer orderPrice;
  private Integer count;

  @ManyToOne
  @JoinColumn(name = "order_id")
  private _Order order;

  @ManyToOne
  @JoinColumn(name = "item_id")
  private _Item item;

  public _OrderItem(Integer orderPrice, Integer count, _Order order, _Item item) {
    this.orderPrice = orderPrice;
    this.count = count;
    this.order = order;
    this.item = item;
  }

  public Long getId() {
    return id;
  }

  public Integer getOrderPrice() {
    return orderPrice;
  }

  public void setOrderPrice(Integer orderPrice) {
    this.orderPrice = orderPrice;
  }

  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public _Order getOrder() {
    return order;
  }

  public void setOrder(_Order order) {
    this.order = order;
  }

  public _Item getItem() {
    return item;
  }

  public void setItem(_Item item) {
    this.item = item;
  }

  @Override
  public String toString() {
    return "_OrderItem{" +
        "id=" + id +
        ", orderPrice=" + orderPrice +
        ", count=" + count +
        ", order=" + order +
        ", item=" + item +
        '}';
  }
}
