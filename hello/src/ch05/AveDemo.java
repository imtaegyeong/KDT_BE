package ch05;

import java.util.Scanner;

public class AveDemo {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    double sum = 0;
    double[] arr = new double[5];

    System.out.println("점수 5개 입력");
    for(int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextDouble();
    }

    for(double point : arr) {
      sum += point;
    }

    System.out.printf("평균은 %.2f 입니다.", sum/arr.length);
  }
}
