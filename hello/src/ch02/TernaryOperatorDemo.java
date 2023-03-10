package ch02;

public class TernaryOperatorDemo {
  public static void main(String[] args) {
    int x = 1, y;
    y = (x==1) ? 10 : 20;

    System.out.println(y);

    x = 2;
    y = (x==1) ? 10 : 20;
    System.out.println(y);
  }
}
