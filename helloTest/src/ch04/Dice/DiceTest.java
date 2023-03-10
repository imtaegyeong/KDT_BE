package ch04.Dice;

public class DiceTest {
  public static void main(String[] args) {
    Dice d = new Dice(30);
    for(int i = 0; i < 50; i++)
      System.out.println(d.roll());
  }
}
