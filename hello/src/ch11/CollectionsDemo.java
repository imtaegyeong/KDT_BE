package ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
  public static void main(String[] args) {
    String[] f = {"포도", "수박", "사과", "키위","망고"};

    Arrays.sort(f);
    System.out.println(Arrays.toString(f));

    List<String> list = Arrays.asList(f);
    List<String> list2 = new ArrayList<>();

    Collections.sort(list);
    System.out.println(list);

    Collections.reverse(list);
    System.out.println(list);


  }
}
