package ch07;

public class AbstractDemo {
  public static void main(String[] args) {
    //Shape s = new Shape();
    Circle c = new Circle(1);
    c.draw();
    System.out.println("원의 넓이는 "+c.findArea());
    Rectangle r = new Rectangle(3,4);
    r.draw();
    System.out.println("사각형의 넓이는 "+r.findArea());
  }
}
