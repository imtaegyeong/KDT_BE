package ch08;

public class CircleTestDemo {
  public static void main(String[] args) {
    Circle c1 = new Circle(3);
    Circle c2 = new Circle(3);
    Circle c3 = new Circle(2);

    System.out.println(c1.equals(c2));
    System.out.println(c2.equals(c3));
  }
}
