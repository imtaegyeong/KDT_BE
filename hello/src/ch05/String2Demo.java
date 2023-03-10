package ch05;

public class String2Demo {
  public static void main(String[] args) {
    String s1="Hi, Java";
    String s2= "Hi, Java";
    String s3 = "Hi, Code";
    String s4 = "Hi, java";

    String s5 = "A"; //65
    String s6 = "B"; //66

    System.out.println(s1.equals(s2));
    System.out.println(s1.equals(s4));
    System.out.println(s1.equalsIgnoreCase(s4));

    System.out.println(s1.compareTo(s3));
    System.out.println(s3.compareTo(s1));
    System.out.println(s1.compareToIgnoreCase(s4));
    System.out.println("Hi, JAVA".compareToIgnoreCase("hi, java"));

    System.out.println(s5.compareTo(s6));
  }
}
