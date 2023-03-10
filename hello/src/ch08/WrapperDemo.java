package ch08;

public class WrapperDemo {
  public static void main(String[] args) {
    Integer i1 = Integer.valueOf(10);
    int i = i1.intValue();
    int i2 = 10;

    Float pi = Float.parseFloat("3.14");
    int i3 = Integer.parseInt("3");
    Integer i4 = Integer.valueOf("11", 16);
    System.out.println(i4);
  }
}
