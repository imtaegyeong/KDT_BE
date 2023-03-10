package ch03;

public class MathDemo {
  public static void main(String[] args) {
    MyMath.add(1L,2L);
  }
}

class MyMath {
  static long add (long a, long b) {return a+b;}
}
