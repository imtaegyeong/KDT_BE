package ch09;

public class Unchecked3Demo {
  public static void main(String[] args) {
    //String s = null;
    String s = "";

    System.out.println(s.length()); // NullPointerException
  }
}
