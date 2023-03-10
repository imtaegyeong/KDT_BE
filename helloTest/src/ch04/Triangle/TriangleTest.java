package ch04.Triangle;

public class TriangleTest {
  public static void main(String[] args) {
    Triangle t1 = new Triangle(10.0, 5.0);
    Triangle t2 = new Triangle(12.0, 5.0);
    Triangle t3 = new Triangle(5.0, 10.0);

    System.out.println(t1.findArea());
    System.out.println(t2.findArea());
    System.out.println(t3.findArea());

    System.out.println(t1.isSame(t2));
    System.out.println(t1.isSame(t3));
    System.out.println(t2.isSame(t3));
  }
}
