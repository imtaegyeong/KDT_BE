package ch08.ex01;
class Circle{
  private final int radius;

  public Circle(int radius){
    this.radius = radius;
  }

  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Circle){
      Circle c = (Circle) obj;
      return radius == c.radius;
    }
    return false;
  }
}

public class CircleTest {
  public static void main(String[] args) {
    Circle c1 = new Circle(3);
    Circle c2 = new Circle(3);

    System.out.println(c1.equals(c2));

  }
}
