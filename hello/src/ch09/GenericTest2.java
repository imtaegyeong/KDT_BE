package ch09;

import java.util.ArrayList;

public class GenericTest2 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(30);
    list.add(65);
    list.add(10);

    Integer i = list.get(0);
    int i1 = list.get(1);
//    Integer i2 = (Integer)(list.get(2));
    System.out.println((list));

    ArrayList<String> slist = new ArrayList<>();
    slist.add("abc");
    slist.add("10");

    String s = slist.get(0);
    String s1 = slist.get(1);

    System.out.println(slist);
  }
}
