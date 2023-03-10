package ch11;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet1Demo {
  public static void main(String[] args) {
    String[] fruits = {"사과","바나나", "포도","수박"};
    Set<String> s1 = new HashSet<>();

    Collections.addAll(s1, fruits);

    System.out.println(s1);

    s1.add("바나나");
    System.out.println(s1);

    s1.remove("포도");
    System.out.println(s1);
    s1.add(null);
    System.out.println(s1);
    s1.add("귤");
    s1.add("배");
    System.out.println(s1);

    Iterator<String> iterator = s1.iterator();
    while(iterator.hasNext()){
      System.out.println("iterator.next() = " + iterator.next());
    }
  }
}
