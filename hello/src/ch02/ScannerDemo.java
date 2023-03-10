package ch02;

import java.util.Scanner;

public class ScannerDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("두 개의 정수를 입력하세요");

    String x = in.nextLine();
    String y = in.nextLine();


    System.out.printf("%d * %d 는 %d 입니다.", Integer.parseInt(x), Integer.parseInt(y), Integer.parseInt(x)*Integer.parseInt(y));
  }
}
