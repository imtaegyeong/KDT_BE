package ch07;


public abstract class Controller {

  boolean Power;

  Controller(boolean power) {
    this.Power = power;
  }

  void show() {
    if(Power) {
      System.out.println(getName()+"켜짐");
    } else {
      System.out.println(getName()+"꺼짐");
    }
  }

  abstract String getName();
}
