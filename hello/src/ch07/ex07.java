package ch07;

public class ex07 {
  public static void main(String[] args) {
    int a = 1, b = 2;
    switch (a++) {
      case 1 : b += a;
      case 2 : b += 5;
    }
    System.out.println(b);
  }
}
