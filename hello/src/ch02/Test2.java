package ch02;

public class Test2 {
  public static void main(String[] args) {
    char temp = 'c';
    int gap = (int)'A' - (int)'a';

    int x = gap+temp;
    char result = (char)x;

    System.out.println(result);
  }
}
