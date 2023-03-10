package ch03;

import java.util.Scanner;

public class MultiIfDemo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    char grade;
    if (i >= 90) {
      grade = 'A';
    } else if (i >= 80) {
      grade = 'B';
    } else if (i >= 70) {
      grade = 'C';
    } else if (i >= 60) {
      grade = 'D';
    } else {
      grade = 'F';
    }
  }
}
