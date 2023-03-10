package ch05;

class Circle{
  double radius;

  public Circle(double radius){
    this.radius = radius;
  }

  public double getRadius(){
    return radius;
  }

  public double findArea(){
    return 3.14 * radius * radius;
  }
}

public class CircleArrayDemo {
  public static void main(String[] args) {
    //int[]
    Circle[] c = new Circle[5];
    for(int i=0; i< c.length; i++)
      System.out.println(c[i]);

   for(int i=0; i< c.length; i++)
      c[i] = new Circle(i + 1.0);

    for(int i=0; i< c.length; i++)
      System.out.printf("%.2f \n", c[i].findArea());
  }
}
