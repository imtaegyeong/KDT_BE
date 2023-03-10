package ch08;

import java.util.Arrays;

public class ArrayDemo {
  public static void main(String[] args) {
    char[] a1 = {'j', 'a', 'v', 'a'};

    //Ctrl Alt V -> 변수 자동생성
    char[] a2 = Arrays.copyOf(a1, a1.length);

    //캐릭터는 프린트하면 주소값이 아니라 안에 내용이 나옴
    System.out.println(a2);

    String[] s1 = {"피자", "케이크", "햄버거", "바나나"};
    System.out.println(s1);
    System.out.println(Arrays.toString(s1));

    Arrays.sort(s1);
    System.out.println(Arrays.toString(s1));

    System.out.println(Arrays.binarySearch(s1,"햄버거"));

    Arrays.fill(s1, 1, 3, "기타");
    System.out.println(Arrays.toString(s1));

  }
}
