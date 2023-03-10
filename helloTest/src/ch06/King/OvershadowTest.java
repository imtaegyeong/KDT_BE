package ch06.King;

class Parent {
  String name = "영조";

  void print() {
    System.out.println("나는 "+name+"다");
  }
}

class Child extends Parent {
  String name = "사도세자";

  void print() {
    System.out.println("나는 "+name+"다");
  }
}

public class OvershadowTest {
  public static void main(String[] args) {
    Parent p = new Child();
    System.out.println(p.name);
    p.print();
  }
}
