package ch06;

public class InheritanceDemo {
  public static void main(String[] args) {
    Circle c1 = new Circle();
    Ball b1 = new Ball("빨강");

    System.out.println("원");
    c1.findArea();
    c1.findRadius();

    System.out.println("공");
    b1.findArea();
    b1.findRadius();
    b1.findColor();
    b1.findVolume();
  }
}
