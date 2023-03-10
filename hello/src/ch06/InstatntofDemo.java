package ch06;

public class InstatntofDemo {
  public static void main(String[] args) {
    Person p = new Person();
    Student s = new Student();

    System.out.println(s instanceof Student);
    System.out.println(s instanceof Person);
    System.out.println(s instanceof Object);
    System.out.println(p instanceof Person);
    System.out.println(p instanceof Student);
    System.out.println(p instanceof Object);

    downCast(s);
    downCast(p);
  }

  static void downCast(Person p) {
    if (p instanceof Student) {
      Student s = (Student) p;
      System.out.println("다운 캐슽팅 성공");
    } else {
      System.out.println("다운 캐스팅 실패");
    }
  }
}
