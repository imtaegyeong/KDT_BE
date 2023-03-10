package ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest1 {
  public static void main(String[] args) {
    String[] s = {"갈매기", "나비", "다람쥐", "라마"};
    //    ArrayList<String> al = new ArrayList<>(Arrays.asList(s));
    List<String> al = new ArrayList<>(Arrays.asList(s));
    List<String> ll = new LinkedList<>(Arrays.asList(s));

    for(String value : al) {
      if(value.length() == 2)
        System.out.println(value);
    }
  }
}
