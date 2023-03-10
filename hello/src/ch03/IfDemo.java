package ch03;

import java.util.Scanner;

public class IfDemo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("정수를 입력 하세요: ");
    int i = sc.nextInt();

    if (i % 2 == 0) {
      System.out.println("짝수");
    } else {
      System.out.println("홀수");
    }
  }
}
