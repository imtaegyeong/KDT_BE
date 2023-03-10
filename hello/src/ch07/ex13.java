package ch07;

public class ex13 {
  public static void main(String[] args) {
    int x = 1, y = 2;
    System.out.println(x++);
    System.out.println(++x + y--);
    System.out.println(++x / 3 + x * ++y);
  }
}
