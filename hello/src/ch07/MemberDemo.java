package ch07;

public class MemberDemo {

  class Eagle extends Bird{
    public void move(){
      System.out.println("독수리가 날아간다.");
    }

    public void sound(){
      System.out.println("독수리가 휘익 소리를 낸다.");
    }
  }

  Eagle e = new Eagle();

  public static void main(String[] args) {
    MemberDemo m = new MemberDemo();
    m.e.move();
    m.e.sound();
  }
}
