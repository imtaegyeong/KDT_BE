package ch04.GolfClub;

public class GolfClub {
  String type;

  GolfClub() {
    this.type = "7번 아이언";
  }

  GolfClub(int n) {
    this.type = n+"번 아이언";
  }

  GolfClub(String s) {
    if(s.equals("퍼터")) {
      this.type = "퍼터";
    } else {
      this.type = "7번 아이언";
    }
  }

  void print() {
    System.out.println(type + "입니다");
  }
}
