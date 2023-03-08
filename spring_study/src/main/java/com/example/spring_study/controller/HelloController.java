package com.example.spring_study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {


  //View를 통해 template의 html을 불러서 실행
  @GetMapping("hello-mvc")
  public String helloMvc(@RequestParam(value ="name") String name, Model model) {
    model.addAttribute("name",name);
    return "hello-template";
  }

  //View없이 바로 데이터를 출력
  @GetMapping("hello-string")
  @ResponseBody
  public String helloString(@RequestParam("name") String name) {
    return "hello " + name;
  }
}
