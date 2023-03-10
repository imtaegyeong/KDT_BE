package ch07;

public class Anooymous1Demo {

  Bird b = new Bird() {
    public void move() {
      System.out.println("무명 날다");
    }

    public void sound() {
      System.out.println("무명 울다");
    }
  };

  public static void main(String[] args) {
    Anooymous1Demo a = new Anooymous1Demo();
    a.b.move();
  }
}
