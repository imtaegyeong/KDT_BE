package ch06;

public class DowncastDemo {
  public static void main(String[] args) {

    Student s = new Student();
    Person p = s;
    Student s1 = (Student) p;



  }
}
