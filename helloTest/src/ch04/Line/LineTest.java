package ch04.Line;

public class LineTest {
  public static void main(String[] args) {
    Line l1 = new Line(1,2);
    Line l2 = new Line(1,2);
    Line l3 = new Line(2,1);

    System.out.println(l1.isSame(l2));
    System.out.println(l1==l2);

    System.out.println(l2.isSame(l3));
    System.out.println(l2==l3);

    System.out.println(l1.isSame(l3));
    System.out.println(l1==l3);
  }
}
