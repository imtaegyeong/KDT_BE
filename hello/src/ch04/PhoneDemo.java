package ch04;

class Phone {
  String model;
  int value;
  void print() {
    System.out.println(model + value);
  }
}

public class PhoneDemo {
  public static void main(String[] args) {
    Phone myPhone = new Phone();
    myPhone.model = "갤러깃";
    myPhone.value = 1000000;
    myPhone.print();

    Phone yourPhone = new Phone();
    yourPhone.model = "아이폰";
    yourPhone.value = 20000000;
    yourPhone.print();

  }
}
