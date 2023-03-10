package ch05;

public class GenderSwitchDemo {
  public static void main(String[] args) {
    Gender1 gender = Gender1.여성;

    switch(gender){
      case 남성:
        System.out.println("병역의 의무가 있다.");
        break;
      case 여성:
        System.out.println("병역의 의무가 없다.");
    }
  }
}

enum Gender1 {
  남성, 여성
}
