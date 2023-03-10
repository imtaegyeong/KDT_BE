package ch02;

public class ArithmeticDemo {
  public static void main(String[] args) {
      int x = 10;
      int y = ++x + x++ + ++x;
      System.out.println(y);
  }
}
