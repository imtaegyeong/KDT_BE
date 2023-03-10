package ch09;

public class SimpleGenDemo {
  public static void main(String[] args) {
    CharClass.printFirstChar("JAVA");
// CharClass.printFirstChar(123);
  }
}


class CharClass<T> {
  static <T extends String> void printFirstChar(T param){
    System.out.println(param.charAt(0));
  }
}