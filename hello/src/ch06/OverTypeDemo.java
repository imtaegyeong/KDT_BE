package ch06;

class Vehicle{
  String name = "탈 것";
  void whoami(){
    System.out.println("나는 탈 것입니다.");
  }
  static void move(){
    System.out.println("이동한다.");
  }
}

class Car extends Vehicle{
  String name = "자동차";
  void whoami(){
    System.out.println("나는 자동차입니다.");
  }
  static void move(){
    System.out.println("달린다.");
  }
}

public class OverTypeDemo {
  public static void main(String[] args) {
    Vehicle v = new Car();
    System.out.println("v.name = " + v.name);
    v.whoami();
    Vehicle.move();
  }
}
