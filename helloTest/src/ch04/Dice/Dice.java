package ch04.Dice;

public class Dice {
  int face;

  Dice(int i) {
    if(i >= 2) {
      this.face = i;
    } else {
      this.face = 6;
    }

  }

  int roll() {
    return (int)(Math.random()*face)+1;
  }
}
