package ch02;

import java.util.Scanner;

public class Test4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc. nextLine();

    int a = (int)s.charAt(0) - 48;
    int b = (int)s.charAt(1) - 48;
    int c = (int)s.charAt(2) - 48;


    System.out.println(a+b+c);

  }
}