package core_java;

class Car{
  String color;
  int door;

  void drive(){
    System.out.println("drive");
  }
  void stop(){
    System.out.println("stop");
  }
}

class FireEngine extends Car{
  void water(){
    System.out.println("water");
  }
}

class Ambulance extends Car{
  void siren(){
    System.out.println("siren");
  }
}
public class PolymorDemo {
  public static void main(String[] args) {
    Ambulance ambulance = new Ambulance();
    FireEngine fireEngine = new FireEngine();
    Car car = new Car();

//    Car c1 = new Ambulance(); // 2 + siren(); 업캐스팅 (공통된 기능만 사용할 수 있게)   c1.drive();
//    Car c2 = new FireEngine(); // 2 + water();

    setDoor(car, 5);
    setDoor(ambulance, 3);
    setDoor(fireEngine, 4);
  }

  static void setDoor(Car c, int door){
    if(c instanceof FireEngine) {
      FireEngine f = (FireEngine) c;
      f.water();
    } else if(c instanceof Ambulance) {
      Ambulance a = (Ambulance) c;
      a.siren();
    } else if(c instanceof Car) {
      c.drive();
    }
  }
//  static void setDoor(Ambulance a, int door){
//
//  }
//  static void setDoor(FireEngine f, int door){
//
//  }

}
