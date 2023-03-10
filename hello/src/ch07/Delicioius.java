package ch07;

public class Delicioius implements Delicious{

  @Override
  public void eat() {
    System.out.println("냠냠");
  }

  @Override
  public void sweet() {
    System.out.println("달달");
  }

  public static void main(String[] args) {
    Delicioius d = new Delicioius();
    d.eat();
    d.sweet();
  }
}
