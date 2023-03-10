package ch09;

public class TryCatchDemo {
  public static void main(String[] args) {
    String s = null;
    System.out.println(args[0]);

    try {
      int i = Integer.parseInt(args[0]); // NumberFormatException
    } catch (NumberFormatException e) {
      System.out.println("정수로 변환할 수 없습니다.");
    }
  }
}
