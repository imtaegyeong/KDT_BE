package ch05.EnumTest;

enum Direction {
   동,서,남,북
}


public class EnumTest {
  public static void main(String[] args) {
    for (Direction d : Direction.values())
      System.out.println(d + "");
  }
}
