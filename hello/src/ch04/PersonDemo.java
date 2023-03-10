package ch04;

public class PersonDemo {
  public static void main(String[] args) {
    Person p = new Person();
    p.setName("민국").setAge(21).sayHello();
  }
}

class Person {
  String name;
  int age;

  public String getName() {
    return name;
  }

  public Person setName(String name) {
    this.name = name;
    return this;
  }

  public int getAge() {
    return age;
  }

  public Person setAge(int age) {
    this.age = age;
    return this;
  }

  public void sayHello() {
    System.out.println(name +"ssi"+ age + "hello");
  }
}
