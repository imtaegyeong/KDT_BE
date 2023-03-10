package ch09.ex01;

class Mydate {
  int year = 2022;
  int month = 02;
  int day = 22;
}

public class NullPointTest {
  public static void main(String[] args) {
    Mydate d = null;

    try {
      System.out.printf("%d %d %d", d.year, d.month, d.day);
    } catch(NullPointerException e){
      System.out.println("날짜 미지정");
    }

  }
}
