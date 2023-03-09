package com.example.spring_study.domain;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Member {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "name", length = 10, nullable = false)
  @NotNull
  private String name;
  @Column(name = "login_id", length = 10, nullable = false)
  @NotNull
  private String loginId;

  @Column(name = "password", length = 12, nullable = false)
  @NotNull
  private String password;

}
