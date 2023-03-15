package domain;

import javax.persistence.*;

@Entity
public class Member {

  @Id
  @Column(name = "member_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Long id;

  public String username;

  public Member(String username) {
    this.username = username;
  }
  public Member() {
  }


  @Override
  public String toString() {
    return "Member{" +
        "id=" + id +
        ", username='" + username + '\'' +
        '}';
  }
}