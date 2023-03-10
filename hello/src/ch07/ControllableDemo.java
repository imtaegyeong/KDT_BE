package ch07;

public class ControllableDemo {
  public static void main(String[] args) {
    TV tv = new TV();
    Computer computer = new Computer();

    tv.turnOn();
    tv.turnOff();
    tv.repair();

    computer.turnOn();
    computer.turnOff();
    computer.repair();
    Controllable.reset();

//    tv.reset();
//    computer.reset();
  }
}
