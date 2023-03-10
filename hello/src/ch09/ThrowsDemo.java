package ch09;

public class ThrowsDemo {
  public static void main(String[] args) {
    try {
      square("123");
      square1("123");
    } catch (NumberFormatException e) {
      System.out.println("숫자가 아닙니다.");
    } catch (ArithmeticException e1) {
      System.out.println("숫자 계산에 오류가 있습니다.");
    }
  }

  private static void square(String s) throws NumberFormatException, ArithmeticException {
    int n = Integer.parseInt(s);
    System.out.println((n * n)/0);
  }

  private static void square1(String s) throws NumberFormatException {
    int n = Integer.parseInt(s);
    System.out.println(n * n);
  }
}
