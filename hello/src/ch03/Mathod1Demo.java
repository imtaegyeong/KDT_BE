package ch03;

public class Mathod1Demo {
  public static void main(String[] args) {

    System.out.println(sum(1,10));
    System.out.println(sum(10,100));
    System.out.println(sum(100,1000));
  }

  public static int sum(int i1, int i2) {
    int sum = 0;

    for (int i = i1; i <= i2; i++) {
      sum += i;
    }

    return sum;
  }

}

