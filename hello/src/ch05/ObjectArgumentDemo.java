package ch05;

public class ObjectArgumentDemo {
  public static void main(String[] args) {
    Circle c1 = new Circle(10.0);
    Circle c2 = new Circle(10.0);
    // call by reference == reference type
    System.out.println(c1.radius);
    zero(c1);
    System.out.println(c1.radius);
    // call by value == primitive type
    System.out.println(c2.radius);
    zero(c2.radius);
    System.out.println(c2.radius);
  }

  public static void zero(Circle c){
    c.radius = 0.0;
  }

  public static void zero(double r){
    r = 0.0;
  }
}
