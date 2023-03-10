package ch03;

public class IncreamentDemo {
  public static void main(String[] args) {
    int x = 0;
    System.out.println("호출 전" + x);
    increment(x);
    System.out.println("호출 후" + x);
  }

  public static void increment(int n) {
    System.out.println("시작" + n);
    n++;
    System.out.println("끝" + n);
  }
}
