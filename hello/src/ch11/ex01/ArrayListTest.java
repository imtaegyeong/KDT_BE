package ch11.ex01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
  public static void main(String[] args) {
    List<String> l = new ArrayList<>(); // Arraylist - 검색 , update /  LinkedList - 추가, 삭제
    
    l.add("갈매기"); // ArrayList 라고 주게 되면, LinkedList 다른 메서드 로 변경해야 할 일이 있다면 .....
    l.add("나비");
    l.add("다람쥐");
    l.add("라마");

    System.out.println("l = " + l);
    Iterator<String> iterator = l.iterator();
    while(iterator.hasNext()){
      String s = iterator.next();
       if(s.length() == 2)
        System.out.println(s);
    }
  }
}
