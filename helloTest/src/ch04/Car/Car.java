package ch04.Car;

public class Car {
  static int number = 0;
  static int redNumber = 0;
  String color;

  Car(String color) {
    if(color.equalsIgnoreCase("red")) {
      number += 1;
      redNumber += 1;
    } else {
      number += 1;
    }
  }
}
