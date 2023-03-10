package ch07;

public class Computer implements Controllable{
  @Override
  public void turnOn() {
    System.out.println("컴퓨터를 켠다.");
  }

  @Override
  public void turnOff() {
    System.out.println("컴퓨터를 끝다.");
  }

  @Override
  public void repair() {
    System.out.println("컴퓨터를 수리한다.");
  }
}
