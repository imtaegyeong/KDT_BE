package ch07;

public class Anonymous1Demo {
  Bird b = new Bird(){
    public void move(){
      System.out.println("독수리가 날아간다.");
    }
    public void sound(){
      System.out.println("독수리가 휘익 소리를 낸다.");
    }
  };

  public static void main(String[] args) {
    Anonymous1Demo a = new Anonymous1Demo();
    a.b.move();
    //a.b.show();
  }
}
