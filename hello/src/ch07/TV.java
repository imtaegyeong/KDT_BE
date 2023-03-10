package ch07;

public class TV implements Controllable{
  @Override
  public void turnOn() {
    System.out.println("TV 전원을 켠다.");
  }

  @Override
  public void turnOff() {
    System.out.println("TV 전원을 끈다.");
  }

  @Override
  public void repair() {
    System.out.println("TV 를 수리한다.");
  }
}
