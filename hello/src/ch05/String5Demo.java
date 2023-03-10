package ch05;

public class String5Demo {
  public static void main(String[] args) {
    String version = String.format("%s %d", "JDK", 11);
    System.out.println(version);

    String fruits = String.join(",","apple", "banana","orange");
    String s1 = "apple";
    String s2 = ", banana";
    String s3 = s1.concat(s2);
    System.out.println(fruits);

    String pi = String.valueOf(3.14);
    System.out.println(pi);
    System.out.println(pi.length());
  }
}
