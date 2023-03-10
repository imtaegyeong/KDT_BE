package ch05.ArrayIsSame;


import java.util.Arrays;

public class ArrayIsSame {
  public static void main(String[] args) {
    int[] a = {1,2,3};
    int[] b = {1,2,3};
    int[] c = {1,2,4};

    System.out.println(isSame(a,b));
    System.out.println(isSame(a,c));
  }

  static boolean isSame(int[] i1, int[] i2) {

    return Arrays.equals(i1, i2);
  }
}
