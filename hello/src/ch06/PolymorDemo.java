package ch06;

class SportsCar extends Car{
  @Override
  void whoami() {
    System.out.println("나는 스포츠 자동차이다.");
  }
}

public class PolymorDemo {
  public static void main(String[] args) {
    Vehicle[] vehicles = new Vehicle[3];
    vehicles[0] = new Car();
    vehicles[1] = new SportsCar();
    vehicles[2] = new Vehicle();

    for(Vehicle vehicle : vehicles)
      vehicle.whoami();
  }
}
