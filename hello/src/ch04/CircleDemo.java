package ch04;

public class CircleDemo {
  public static void main(String[] args) {
    Circle circle = new Circle(10.0, "red");
    System.out.println(circle.getRadius());
    System.out.println(circle.findArea());
    circle.spec();
  }
}

class Circle {
  private double radius;
  private String color;

  public Circle() {

  }

  public Circle(double radius) {
    this.radius = radius;
  }

  public Circle(double radius, String color) {
    this.radius = radius;
    this.color = color;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  double findArea() {
    return 3.14 * radius * radius;
  }

  public void spec() {
    System.out.println("이 원의 색상은 " + this.color + "이고 반지름은 " + this.radius+"입니다.");
  }
}
