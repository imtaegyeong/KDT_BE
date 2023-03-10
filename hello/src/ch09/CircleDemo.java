package ch09;

class Circle implements Comparable{
  int r;

  public Circle(int r){
    this.r = r;
  }

  @Override
  public int compareTo(Object o) {
    if(o instanceof Circle){
      Circle c = (Circle) o;
      return r < c.r ? -1 : ( r > c.r ? 1 : 0);
    }
    return -999;
  }
}
public class CircleDemo {
  public static void main(String[] args) {
    Circle c = new Circle(100);
    Circle c1 = new Circle(80);

    System.out.println(c1.compareTo(c));
  }
}
