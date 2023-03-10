package ch09;

public class Unchecked4Demo {
  public static void main(String[] args) {
    Object[] obj3 = null;
    Object[] obj = new Object[0];
    Object[] obj2 = {};
    try {
      System.out.println(obj.length); // NullPointerException
      System.out.println(obj2.length); // NullPointerException
      System.out.println(5/0);
      //System.out.println(obj3.length); // NullPointerException
    } catch (NullPointerException |  ArithmeticException e2) {
      System.out.println("null 객체를 참조했거나 0 으로 나눴습니다.");
      System.out.println(e2.getMessage());
    } finally {
      System.out.println("종료");
    }
    System.out.println("프로그램 종료");

    //System.out.println();
  }
}
