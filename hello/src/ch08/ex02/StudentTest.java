package ch08.ex02;

class Student {
  String name;
  int grade;
  public Student(String name, int grade){
    this.name = name;
    this.grade = grade;
  }
  @Override
  public String toString() {
    return "학생[" + name + "," + grade + "학년]";
  }
}
public class StudentTest {
  public static void main(String[] args) {
    System.out.println(new Student("김삿갓", 1));
    System.out.println(new Student("홍길동", 3));
  }
}
