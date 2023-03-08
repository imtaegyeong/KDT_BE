package com.example.first.controllerex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class ResponseJsonController {
  @GetMapping("response-hello")
  public Hello response(String name, String id) {
    Hello hello = new Hello();
    hello.setId(id);
    hello.setName(name);
    return hello;
  }

  static class Hello {
    private String name;
    private String id;

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getId() {
      return id;
    }

    public void setId(String id) {
      this.id = id;
    }
  }
}
