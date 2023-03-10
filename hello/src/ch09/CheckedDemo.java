package ch09;

public class CheckedDemo {
  public static void main(String[] args) {
    try {
      Thread.sleep(100);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}
