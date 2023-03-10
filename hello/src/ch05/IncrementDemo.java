package ch05;

public class IncrementDemo {
  public static void main(String[] args) {
    int[] x = {10,20,30,40,50,60};
    System.out.println("호출하기 전 : " + x[2]);
    increment(x);
    System.out.println("호출하고나서 : " + x[2]);
    int y = 10;
    System.out.println("호출하기 전 : " + y);
    increment(y);
    System.out.println("호출하고나서 : " + y);
  }
  public static void increment(int[] n) {
    System.out.println("메서드 안에서 수정전 : "+ n[2]);
    n[2] += 100;
    System.out.println("메서드 안에서 수정후: "+ n[2]);
  }
  public static void increment(int n) {
    System.out.println("메서드 안에서 수정전 : "+ n);
    n += 100;
    System.out.println("메서드 안에서 수정후: "+ n);
  }
}
