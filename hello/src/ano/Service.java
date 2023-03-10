package ano;

public class Service {
  public static void main(String[] args) {
    method1();
    method2();
    method3();
  }

  @PrintAnnotation
  public static void method1(){
    System.out.println("1번 메서드 - default");
  }

  @PrintAnnotation(value = "*")
  public static void method2(){
    System.out.println("2번 메서드 - *만");
  }

  @PrintAnnotation(value = "#", number = 20)
  public static void method3(){
    System.out.println("1번 메서드 - #, 20");
  }
}
