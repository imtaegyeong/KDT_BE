package ch06;

public class UpcastDemo {
  public static void main(String[] args) {
    Person p;
    Student s = new Student();

    p = s; // 자동형변환,업캐스팅
    System.out.println(p.name);
    p.whoami();


//    p.work();
//    p.number;
  }
}
