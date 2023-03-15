package domain;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
public class Team {

  // --변수--

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "team_id")
  private Long id;
  private String name;

  // --게터 세터--
  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Team{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }
}
