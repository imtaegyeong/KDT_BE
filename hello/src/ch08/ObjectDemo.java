package ch08;

public class ObjectDemo {
  public static void main(String[] args) {
    Mouse m1=new Mouse("Logitech");
    Mouse m2=new Mouse("Logitech");
    Keyboard k1 = new Keyboard("Logitech");
    Keyboard k2 = new Keyboard("Logitech");

    String s1 = "Logitech";
    String s2 = "Logitech";

    System.out.println(k1==k2);
    System.out.println(k1);
    System.out.println(k2);

    System.out.println(k1.equals(k2));
    System.out.println(m1.equals(m2));

    System.out.println(m1.equals(k1));
  }
}
