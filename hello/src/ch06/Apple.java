package ch06;

class Fruit{
  String color;

  public Fruit(){

  }
  public Fruit(String color){
    this.color = color;
  }
}

public class Apple extends Fruit{
  double weight;

  public Apple(double weight){
    //super("red");
    this.weight = weight;
  }


}

