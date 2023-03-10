package ch08;

import java.util.StringTokenizer;

public class StringTokenizeDemo {
  public static void main(String[] args) {
    String s = "Hello World, This is a Java";

    StringTokenizer st = new StringTokenizer(s, ",");

    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }
  }
}
