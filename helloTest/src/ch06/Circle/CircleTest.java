package ch06.Circle;

class Circle {
  int radius;

  Circle(int radius){
    this.radius = radius;
  }

  void show() {
    System.out.println("반지름" + radius + "원");
  }
}

class ColorCircle extends Circle {
  String color;

  ColorCircle(int radius, String color) {
    //부모 생성자 호출 super();
    super(radius);
    this.color = color;
  }

  @Override
  void show() {
    System.out.println("반지름" + radius + color +"색 원");
  }
}

public class CircleTest{
  public static void main(String[] args) {
    Circle c1 = new Circle(5);
    ColorCircle c2 = new ColorCircle(10, "red");

    c1.show();
    c2.show();
  }
}
