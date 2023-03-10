package ch05;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> scores = new ArrayList<>();
    int data;
    int sum = 0;

    System.out.println("정수를 입력하세요. 입력을 종료하려면 음수값을 입력하세요");
    //System.out.println(scores.size());
    while((data =in.nextInt()) >= 0) {
      scores.add(data);
    }

    scores.add(1,75);

    for(int score:scores)
      System.out.println(score);

    System.out.println(scores);

    //System.out.println(scores.toArray().toString());

//    for(int i=0; i<scores.size() ; i++){
//      sum += scores.get(i);
//    }


//    System.out.println(scores.remove(0) + "을 지웠습니다.");
//    System.out.println(scores.size());
//    System.out.println(sum);
  }
}
