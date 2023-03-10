package ch02;

import java.util.Scanner;

public class Test5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("전공 이수 학점:");
    int j = sc.nextInt();
    System.out.print("교양 이수 학점:");
    int g = sc.nextInt();
    System.out.print("일반 이수 학점:");
    int i = sc.nextInt();

    if (j+g+i >= 140 && j >= 70 && ((g >= 30 && i >= 30) || g+i >=80)) {
      System.out.println("졸업");
    } else {
      System.out.println("안졸업");
    }
  }
}
