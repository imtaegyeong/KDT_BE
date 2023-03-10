package ch07;

public class MovableDemo {
  public static void main(String[] args) {
    Movable m = new Car();

    m.move(1);
    m.move(5);
    //m.show();
    Car c = (Car)m;
    c.move(5);
    c.show();
  }
}
