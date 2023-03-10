package ch12;

import java.util.*;

@FunctionalInterface
interface MyF {
  int max(int a, int b);
}

public class LamdaTest {
  public static void main(String[] args) {
    //익명 클레스로 만든 익명 객체
    MyF myf = (a, b) -> a>b ? a:b ;
    System.out.println(myf.max(3,5));

    // Comparable 인터페이스 ==> compareto() - this랑 매개변수랑 비교
    // Comparator 인터페이스 ---> compare(T 1, T 2) 1이랑 2를 비교

    List<String> list = Arrays.asList("abc","aaa","bbb","ccc","aaa");
    System.out.println(list);
    //람다식 전
    //    Collections.sort(list, new Comparator<>() {
    //      @Override
    //      public int compare(String o1, String o2) {
    //        return o1.compareTo(o2);
    //      }
    //    });

    //람다식 후
    Collections.sort(list, (o1, o2) -> o2.compareTo(o1));
    System.out.println(list);
  }
}

