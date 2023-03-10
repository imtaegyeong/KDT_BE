package ch06;

public class Circle {
  private void secret(){
    System.out.println("비밀");
  }
  protected void findRadius(){
   // secret();
    System.out.println("반지름이 10입니다.");
  }
  public void findArea(){
    System.out.println("넓이는 파이*반지름*반지름입니다.");
  }
}
