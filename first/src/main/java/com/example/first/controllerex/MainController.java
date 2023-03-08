package com.example.first.controllerex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class MainController {

  @GetMapping("/main") // 여기는 local host의 주소 입력
  public String main() {
    return "main"; // View를 통해서 템플릿 폴더 아래 return과 같은 이름을 html, jsp파일을 찾아서 보여줌
  }

  @GetMapping("/main2") // 여기는 local host의 주소 입력
  public String main(@RequestParam String name, int num, Model model) { //리콰이어파람에서 리콰이어 펄스로 하면 선택값이돼서 꼭 안넣어도됨
    model.addAttribute("name", name);
    model.addAttribute("num", num);
    return "main"; // View를 통해서 템플릿 폴더 아래 return과 같은 이름을 html, jsp파일을 찾아서 보여줌
  }

  @GetMapping("/main3") // 여기는 local host의 주소 입력
  public String main(@RequestParam Map<String, String> param, Model model) { //리콰이어파람에서 리콰이어 펄스로 하면 선택값이돼서 꼭 안넣어도됨
    String name = param.get("name");
    String num = param.get("num");

    model.addAttribute("name", name);
    model.addAttribute("num", num);
    return "main"; // View를 통해서 템플릿 폴더 아래 return과 같은 이름을 html, jsp파일을 찾아서 보여줌
  }
}
