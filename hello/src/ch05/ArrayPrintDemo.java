package ch05;

import java.util.Arrays;

public class ArrayPrintDemo {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    String[] sArr = {"A","B","C"};
    char[] cArr = {'a','b','c'};

    System.out.println(arr);
    System.out.println(cArr);
    System.out.println(sArr);

    for(int i=0; i<5; i++){
      System.out.println(arr[i]);
    }
    System.out.print("[");
    for(int num : arr){  // foreach
      System.out.print(num);
      System.out.print(",");
    }
    System.out.print("]");
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(cArr));
    System.out.println(Arrays.toString(sArr));
  }
}
