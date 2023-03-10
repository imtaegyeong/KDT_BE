package ch06;


class Animal {
  public Animal(){
    System.out.println("동물입니다.");
  }

  public Animal(String s){
    System.out.println("동물입니다." + s);
  }
}
class Mammal extends Animal{
  public Mammal(){
    //super();
    System.out.println("포유류입니다.");
  }
  public Mammal(String s){
    super(s);
    System.out.println("포유류입니다." + s);
  }
}
public class AnimalDemo {
  public static void main(String[] args) {
    Mammal m = new Mammal();
    Mammal m2 = new Mammal("사자");
  }
}
