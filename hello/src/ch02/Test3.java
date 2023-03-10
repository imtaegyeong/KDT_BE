package ch02;

import java.util.Scanner;

public class Test3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double a = sc.nextDouble();

    double result = ((a-32) * 5) / 9;

    System.out.println(result);
  }
}
