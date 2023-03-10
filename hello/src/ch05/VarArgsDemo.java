package ch05;

public class VarArgsDemo {
  public static void main(String[] args) {
    printSum(1,2,3,4,5);
    printSum(10,20,30);
    System.out.println(String.join(",","A","B","C"));
  }

  public static void printSum(int...v){
    for(int num:v){
      System.out.println(num);
    }
  }
}
