package ch02;

public class IncrementDemo {
  public static void main(String[] args) {
    int x = 1, y = 1;
    int z1, z2;
    z1 = ++x;
    z2 = y++;

    System.out.println(z1);
    System.out.println(z2);
  }
}
