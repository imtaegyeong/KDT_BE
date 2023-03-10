package CoreJava;

class Car {
  String color;
  int door;

  void drive(){
    System.out.println("drive");
  }

  void stop(){
    System.out.println("stop");
  }
}

class FireEngine extends Car {

  @Override
  void drive() {
    System.out.println("소방차 간다");
  }

  @Override
  void stop() {
    System.out.println("소방차 멈춘다");
  }

  void water() {
    System.out.println("water");
  }
}

class Ambulance extends Car{

  @Override
  void drive() {
    System.out.println("앰뷸런스 간다");
  }

  @Override
  void stop() {
    System.out.println("앰뷸런스 멈춘다");
  }

  void siren(){
    System.out.println("siren");
  }
}


public class PolymorDemo {
  public static void main(String[] args) {
    Ambulance ambulance = new Ambulance();
    ambulance.drive();
    ambulance.stop();
    ambulance.siren();

    FireEngine fire = new FireEngine();
    fire.drive();
    fire.stop();
    fire.water();

    Car car = new Car();
    car.drive();
    car.stop();

    Car c1 = new Ambulance();
    c1.drive();
    c1.stop();

    Car c2 = new FireEngine();
    c2.drive();
    c2.stop();

    Ambulance am = (Ambulance) c1;
    am.siren();

    Ambulance am2 = (Ambulance) c2;
    //    am2.siren();
  }
}
