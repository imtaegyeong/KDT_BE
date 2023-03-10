package ch08.ex04;

import java.util.Random;
class Dice{
  public int roll(){
    //return (int)(Math.random()*6) + 1;
    Random r = new Random();
    return r.nextInt(6) + 1;
  }
}
public class DiceTest {
  public static void main(String[] args) {
    for(int i=0; i<10;i++)
      System.out.println(new Dice().roll());
  }
}
