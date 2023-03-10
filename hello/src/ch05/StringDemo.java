package ch05;

public class StringDemo {
  public static void main(String[] args) {

    //리터럴 형으로 String을 선언하면 두 String이 가르키는 주소값은 동일하다
    String s1 = "Hello Java";
    String s2 = "Hello Java";

    System.out.println("s1 == s2 " + (s1 == s2));

    //new String을 통해 참조형으로 String을 선언하면 두 String이 가르키는 주소값이 다르다.
    String s3 = "Hello Java";
    String s4 = "Hello Java";

    System.out.println("s3 == s4 " + (s3==s4));

    // String1 = String2를 통해 대입하면 두 String이 가르키는 주소값은 같아진다. 기존 주소값은 갈비지 컬랙터에 의해 수집됨
    s1 = s3;
    System.out.println("s1=s3 s1 == s3 " + (s1 == s3));
  }
}
