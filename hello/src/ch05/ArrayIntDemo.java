package ch05;

import java.util.Arrays;

public class ArrayIntDemo {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    char[] carr ={'a', 'b'};

    System.out.println(arr);
    System.out.println(carr);

    for (int i = 0; i < 5; i++) {
      System.out.println(arr[i]);
    }

    for(int num : arr) {
      System.out.println(num);
    }

    System.out.println(Arrays.toString(arr));
  }
}
