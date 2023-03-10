package ch10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LamdaTest {
  public static void main(String[] args) {
    MyF f = (a, b)-> a > b ? a : b ;
    System.out.println(f.max(3,5));  // 람다식(익명객체)이 호출됨

    // Comparable ==> this.compareTo(object)
    // Comparator ==> int compare(T o1, T o2);

    List<String> list = Arrays.asList("abc", "aaa", "bbb", "ddd", "aaa");
//    Collections.sort(list, new Comparator<>() {
//      @Override
//      public int compare(String o1, String o2) {
//        return o1.compareTo(o2);  // o1 < o2 : + ==> 내림차순
//                                  // o1 > o2 : + ==> 오름차순
//      }
//    });

    Collections.sort(list, (o1, o2) ->  o2.compareTo(o1));
        //return ;  // o1 < o2 : + ==> 내림차순
                                // o1 > o2 : + ==> 오름차순


    System.out.println("정렬후 : " + list);

  }
}

@FunctionalInterface
interface MyF {
  int max(int a, int b);
}
