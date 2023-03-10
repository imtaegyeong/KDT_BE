package ch04.Car;

public class CarTest {
  public static void main(String[] args) {
    Car c1 = new Car("red");
    Car c2 = new Car("Red");
    Car c3 = new Car("blue");
    Car c4 = new Car("RED");

    System.out.printf("자동차 수 : %d, 빨간차 수 : %d", Car.number, Car.redNumber);
  }
}
