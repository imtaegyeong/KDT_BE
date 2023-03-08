package com.example.first.controllerex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

  @GetMapping("/hello") // 여기는 local host의 주소 입력
  public String hello() {
    return "hello"; // View를 통해서 템플릿 폴더 아래 return과 같은 이름을 html, jsp파일을 찾아서 보여줌
  }

  @GetMapping("/hello1") // ?name=aaa로 요청 받아서 처리하기
  public String hello1(@RequestParam("name") String name) {
    return "hello1"; // View를 통해서 템플릿 폴더 아래 return과 같은 이름을 html, jsp파일을 찾아서 보여줌
  }

  @GetMapping("/hello2") // ?name=aaa로 요청 받아서 처리하기
  public String hello2(@RequestParam("name") String name, Model model) {
    model.addAttribute("name", name); //model에 키:밸류 형식으로 데이터를 넣어서 리턴시 전달
    return "hello2"; // View를 통해서 템플릿 폴더 아래 return과 같은 이름을 html, jsp파일을 찾아서 보여줌
  }



}
