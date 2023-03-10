package ch07;

public class DeliciousDemo implements Delicious{
  @Override
  public void eat() {
    System.out.println("먹습니다.");
  }

  @Override
  public void sweet() {
    System.out.println("달콤합니다.");
  }

  public static void main(String[] args) {
    DeliciousDemo d = new DeliciousDemo();
    d.eat();
    d.sweet();
  }
}
