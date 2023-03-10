package ch05;

public class String1Demo {
  public static void main(String[] args) {
    String s1 = "Hello, java";
    String s2 = "Hello, java";

    System.out.println("s1 == s2 : " + (s1 == s2));

    String s3 = "Hello, java";
    String s4 = "Hello, java";

    s1 = s3;
    System.out.println("s3 == s4 : " + (s3==s4));
    System.out.println("s1 == s3 : " + (s1==s3));
  }
}
