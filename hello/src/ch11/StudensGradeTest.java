package ch11;

import java.util.*;

public class StudensGradeTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> al = new ArrayList<>();
    char grade;

    while(true) {
      System.out.println("점수를 입력하세요");
      int point = sc.nextInt();
      if (point >= 0) {
        al.add(point);
      } else {
        break;
      }
    }

    int high = Collections.max(al);
    System.out.println(high);

    System.out.println("총 학생수: " + al.size());
    for(int i = 0; i <al.size(); i++) {
      if(al.get(i) >= (high-10)) {
        grade = 'A';
      } else if(al.get(i) >= (high-20)) {
        grade = 'B';
      } else {
        grade = 'F';
      }

      System.out.println(i+1 + "번쨰 학생의 점수는" + al.get(i)+"점 이고" + grade + "등급입니다.");
    }







  }
}
