package ch04;

public class StaticvarDemo {
  public static void main(String[] args) {
    Hero h1 = new Hero("1번", 1);
    h1.show();
    Hero h2 = new Hero("2번", 2);
    h2.show();
    Hero h3 = new Hero("3번", 1);
    h3.show();
  }
}

class Hero{
  static int id;
  String name;
  int gender;

  Hero(String name, int gender) {
    this.name = name;
    this.gender = gender;
    id++;
  }

  void show() {
    System.out.println(id);
    System.out.println(this.name);
    System.out.println(this.gender);
  }
}