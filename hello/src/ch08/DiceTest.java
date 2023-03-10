package ch08;

import java.util.Random;

class Dice{
  public static int roll() {
    //    Random r = new Random();
    //    return r.nextInt(6)+1;
    return (int) (Math.random()*6)+1;
  }

}

public class DiceTest {
  public static void main(String[] args) {
    for(int i = 0; i < 10; i++)
      System.out.println(Dice.roll());
  }
}
