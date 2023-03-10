package com.example.third.controller.session;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberSession {
  private long id;
  private String loginId;
  private String name;
}
