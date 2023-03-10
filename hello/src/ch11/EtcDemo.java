package ch11;

import java.util.*;

public class EtcDemo {
  public static void main(String[] args) {
    List<String> list1 = List.of("A", "B", "C", "A", "E","E", "A", "B");
    HashMap<String, Integer> m = new HashMap<>();
    m.put("A", 1);
    m.put("B", 2);

    System.out.println(list1);
    HashSet<String> hs = new HashSet<>(list1);
    System.out.println("hs = " + hs);
    ArrayList<String> al = new ArrayList<>(list1);
    System.out.println("al = " + al);

    Collections.sort(al);
    System.out.println("al = " + al);
  }
}
