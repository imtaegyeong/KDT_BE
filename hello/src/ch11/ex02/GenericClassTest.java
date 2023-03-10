package ch11.ex02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Person {
  String name;
  int age;

  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }

  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Person){
      Person p = (Person)obj;
      return name.equals(p.name) && age == p.age;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
    //name.hashCode()+age; // 123 + 35 , 123 + 35 (나자바), 355 + 20 ,
  }

  @Override
  public String toString() {
    return "제 이름은 "+name+"이고 "+age+"살입니다.";
  }
}
public class GenericClassTest {
  public static void main(String[] args) {
    Set<Person> set = new HashSet<>();
    set.add(new Person("김열공", 20));
    set.add(new Person("최고봉", 56));
    set.add(new Person("우등생", 16));
    set.add(new Person("나자바", 35));
    set.add(new Person("나자바", 34));
    for(Person p : set){
      System.out.println("person = " + p);
    }
    Iterator<Person> iterator = set.iterator();
    while(iterator.hasNext()){
      System.out.println(iterator.next());
    }
  }
}
