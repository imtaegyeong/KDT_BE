package domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class _Order {

  @Id
  @Column(name = "order_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private Date date;
  private _Status status;

  @ManyToOne
  @JoinColumn(name = "member_id")
  private _Member member;

  public Long getId() {
    return id;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public _Status getStatus() {
    return status;
  }

  public void setStatus(_Status status) {
    this.status = status;
  }

  public _Member getMember() {
    return member;
  }

  public void setMember(_Member member) {
    this.member = member;
  }

  public _Order(Date date, _Status status, _Member member) {
    this.date = date;
    this.status = status;
    this.member = member;
  }

  @Override
  public String toString() {
    return "_Order{" +
        "id=" + id +
        ", date=" + date +
        ", status=" + status +
        ", member=" + member +
        '}';
  }
}
