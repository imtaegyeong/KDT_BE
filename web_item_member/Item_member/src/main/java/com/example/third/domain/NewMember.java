package com.example.third.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NewMember {


  @Id
  @Column(name = "member_id")
  public String id;

  @Column(name = "team_id")
  public Team team;

  public String userName;

  Team getTeam() {
    return team;
  }

}
