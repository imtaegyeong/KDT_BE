package ch05.EnumTest;

enum Direction {
   λ,μ,λ¨,λΆ
}


public class EnumTest {
  public static void main(String[] args) {
    for (Direction d : Direction.values())
      System.out.println(d + "");
  }
}
