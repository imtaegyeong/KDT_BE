package ch08;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
  public static void main(String[] args) {

    String s = "of the people, by the people, for the people";
    StringTokenizer stringTokenizer = new StringTokenizer(s, ",");
    System.out.println(stringTokenizer);
    while(stringTokenizer.hasMoreTokens()) {
      System.out.println(stringTokenizer.nextToken());
    }
  }
}
