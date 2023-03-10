package ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Person {

  String name;
  int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return name + ":" + age;
  }

  @Override
  public int hashCode() {
    return name.hashCode()+age;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Person) {
      Person p = (Person) obj;
      return this.name.equals(p.name) && this.age == p.age;
    }
    return false;
  }
}


public class PersonTest {
  public static void main(String[] args) {
    Set<Person> set = new HashSet<>();
    set.add(new Person("김열공", 20));
    set.add(new Person("최고봉", 56));
    set.add(new Person("우등생", 16));
    set.add(new Person("나자바", 35));
    set.add(new Person("나자바", 36));
    set.add(new Person("나자바", 35));
    set.add(new Person("우등생2", 16));

    for(Person p : set) {
      System.out.println(p.toString());
    }

//    Iterator<Person> it = set.iterator();
//    while(it.hasNext()) {
//      System.out.println(it.next());
//    }

  }
}
