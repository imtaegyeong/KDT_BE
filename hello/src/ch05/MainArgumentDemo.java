package ch05;

public class MainArgumentDemo {
  public static void main(String[] args) {
    if(args.length == 2){
      int i = Integer.parseInt(args[1]);
      nPrintln(args[0], i);
    } else {
      System.out.println("안녕~~~");
    }
  }

  public static void nPrintln(String s , int n){
    for (int i = 0 ; i < n ; i++) {
      System.out.println(s);
    }
  }
}
