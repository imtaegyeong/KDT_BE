package ch05;

public class String3Demo {
  public static void main(String[] args) {
    String s1 = "Hi";
    String s2 = ", java";
    String t1 = "          java             ";

    System.out.println(t1.trim());
    System.out.println(s2.substring(2,4));
    System.out.println(s2.length());
    s1 = s1.concat(s2);
    //System.out.println(s1.concat(s2));
    System.out.println(s1);

    String s3 = " ";
    System.out.println(s3.isEmpty());
    System.out.println(s3.isBlank());

    String s4="";
    System.out.println(s4.isEmpty());
    System.out.println(s4.isBlank());

    System.out.println(s2.toUpperCase()); // s2.메소드 , s2 자체가 변하지 않는다.
    System.out.println(s2);
  }
}
