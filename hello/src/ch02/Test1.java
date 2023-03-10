package ch02;

import java.util.Scanner;

public class Test1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("입력");
    int x = sc.nextInt();

    int hour = x / 3600;
    int min = (x - (3600*hour)) / 60;
    int sec = x - ((3600*hour) + (60*min));

    System.out.printf("%d시 %d분 %d초", hour,min,sec);
  }
}
