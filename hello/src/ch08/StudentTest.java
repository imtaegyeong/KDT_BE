package ch08;

public class StudentTest {
  public static void main(String[] args) {
    Student s1 = new Student("홍길동", 1);
    Student s2 = new Student("김삿갓", 3);

    System.out.println(s1);
    System.out.println(s2);
  }
}

class Student {
  String name;
  int grade;

  Student(String name, int grade) {
    this.name = name;
    this.grade = grade;
  }

  @Override
  public String toString() {
    return "학생[" +name + "," +grade+"]";
  }
}

