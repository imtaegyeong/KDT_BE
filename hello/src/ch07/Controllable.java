package ch07;

/**
 * 전자제품을 수리하고 초기화하는 기능이 구현되어 있습니다.
 * 전원을 켜고 끄는 메서드는 추상클래스이므로 구현하셔야 합니다.
 */
public interface Controllable {
  void turnOn();
  void turnOff();

  default void repair(){
    System.out.println("장비를 수리한다.");
  }

  static void reset(){
    System.out.println("장비를 초기화한다.");
  }
}
