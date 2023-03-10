package ch08;


import java.util.Arrays;

public class ArraysDemo {
  public static void main(String[] args) {
    char[] a1 = {'j', 'a', 'v', 'a'};
    char[] a2 = Arrays.copyOf(a1, a1.length);

    System.out.println(a2);

    String[] sa = {"케이크", "애플", "도넛", "바나나"};
    System.out.println(sa);
    System.out.println(Arrays.toString(sa));

    Arrays.sort(sa);
    System.out.println(Arrays.toString(sa));

    System.out.println(Arrays.binarySearch(sa, "도넛"));

    Arrays.fill(sa, 2,3,"기타");
    System.out.println(Arrays.toString(sa));
  }
}
