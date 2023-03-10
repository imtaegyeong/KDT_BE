package ch05;

import java.util.Scanner;

public class Array1Demo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] scores = new int[5];
    int sum=0;
    System.out.println("5개의 정수를 입력하세요");
    // 5 => scores.length

    for(int i=0; i<scores.length; i++){
      scores[i] = in.nextInt();
    }

    for(int num : scores){
      sum += num;
    }

    System.out.println("총점 : " + sum);
    System.out.printf("평균 : %.2f" ,sum/(float)scores.length);
  }
}
