package ch06.Students;

class Person{
  int age;
  String name;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  void show() {
    System.out.println("사람 / 이름 : " + name + ", 나이 : " + age);
  }
} // end of class

class Student extends Person {
  int sNumber;

  Student(String name, int age, int sNumber) {
    super(name, age);
    this.sNumber = sNumber;
  }

  void show() {
    System.out.println("학생 / 이름 : " + name + ", 나이 : " + age + ", 학번 : " + sNumber);
  }
} // end of class

class ForiginStudent extends Student {
  String from;

  ForiginStudent(String name, int age, int sNumber, String from) {
    super(name, age, sNumber);
    this.from = from;
  }

  void show() {
    System.out.println("유학생 / 이름 : " + name + ", 나이 : " + age + ", 학번 : " + sNumber + ", 출신 : " + from);
  }
} // end of class

public class StudentsTest {
  public static void main(String[] args) {
    Person[] ps = {
        new Person("마이클", 15),
        new Student("제이스", 15, 100),
        new ForiginStudent("차이홍", 16, 105, "중국")
    };

    for(Person p : ps ) {
      p.show();
    }

  }

}
