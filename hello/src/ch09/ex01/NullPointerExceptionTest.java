package ch09.ex01;

class Mydate {
  int year = 2035;
  int month = 12;
  int day = 25;
}
public class NullPointerExceptionTest {
  public static void main(String[] args) {
    Mydate d = null;

    try {
      System.out.printf("%d년 %d월 %d일", d.year, d.month, d.day);
    } catch (NullPointerException e) {
      System.out.println("날짜가 지정되지 않아서 출력할 수 없습니다.");
    }
    d = new Mydate();
    System.out.printf("%d년 %d월 %d일", d.year, d.month, d.day);
  }
}
