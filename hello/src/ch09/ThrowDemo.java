package ch09;

public class ThrowDemo {

  public static void main(String[] args) {

    try {
      square("123");
    } catch (NumberFormatException e) {
      System.out.println("숫자가 아닙니다");
    } catch (ArithmeticException e1) {
      System.out.println("숫자 오류");
    }
  }

  private static void square(String s) throws NumberFormatException, ArithmeticException {
    int n = Integer.parseInt(s);
    System.out.println(n/0);
  }
}

