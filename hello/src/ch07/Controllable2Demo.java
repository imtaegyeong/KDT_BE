package ch07;

public class Controllable2Demo {
  public static void main(String[] args) {
    Contollerable[] controlls = {new TV(), new Computer()};

    for(Contollerable c : controlls) {
      c.turnOn();
      c.turnOff();
      c.repair();
    }
  }
}
