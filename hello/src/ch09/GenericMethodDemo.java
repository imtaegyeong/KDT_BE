package ch09;

import java.util.ArrayList;

public class GenericMethodDemo {
  static class Utils{
    //static 뒤의 T 타입의 class = Number 타입만 올 수 있다.
    public static <T extends Number> void showArray(T[] a) {
      for( T t: a) {
        System.out.println(t);
      }
    }

    public  static <T> T getLst(T[] a) {
      return a[a.length-1];
    }
  }

  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>();


    Integer[] ia = {1,2,3,45};
    Character[] ca = {'a', 'b', 'c', 'd'};

    Utils.showArray(ia);
    //    Utils.showArray(ca);
  }
}
