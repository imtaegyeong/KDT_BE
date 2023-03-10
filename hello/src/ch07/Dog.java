package ch07;

public class Dog implements Animal{
  @Override
  public void sound() {
    System.out.println("강아지는 멍멍");
  }
}
