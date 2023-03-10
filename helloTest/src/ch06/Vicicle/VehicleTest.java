package ch06.Vicicle;

class Vehicle {
  String color;
  int speed;

  public Vehicle(String color, int speed) {
    this.color = color;
    this.speed = speed;
  }

  void show() {
    System.out.printf("이 차의 색상은 %s이고 속도는 %d입니다. \n", color,speed);
  }
}

class Car extends Vehicle {
  int displacement;
  int gears;

  public Car(String color, int speed, int displacement, int gears){
    super(color,speed);
    this.displacement = displacement;
    this.gears = gears;
  }

  @Override
  void show() {
    System.out.printf("이 차의 생상은 %s이고 속도는 %d, 기어는 %d단까지 있습니다. 배기량은 %d cc입니다. \n", color,speed,gears,displacement);
  }
}


public class VehicleTest {
  public static void main(String[] args) {
    Car c = new Car("파랑", 200, 1000, 5);
    c.show();

    Vehicle v = c;
    v.show();
  }
}
