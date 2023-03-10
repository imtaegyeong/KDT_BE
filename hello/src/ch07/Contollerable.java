package ch07;

public interface Contollerable {

  /**
   * 전자제품 수리 초기화 기능 구현
   * 전원 켜고 끄는 메서든느 추상 클레스
   */
  void turnOn();

  void turnOff();

  //default는 구현 한것을 오버라이드 해서 바꿀 수 있음
  default void repair() {
    System.out.println("장비 수리");
  }
  //static은 구현 한것을 오버라이드 해서 바꿀 수 없음
  static void reset() {
    System.out.println("초기화");
  }
}
