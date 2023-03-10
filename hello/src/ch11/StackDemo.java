package ch11;

import java.util.List;
import java.util.Stack;

public class StackDemo {
  public static void main(String[] args) {
    List<String> l1 = new Stack<>();
    Stack<String> s1 = new Stack<>();

    s1.push("사과");
    s1.push("바나나");
    s1.push("체리");

    System.out.println("s1.peek() = " + s1.peek());

    System.out.println(s1.pop());
    System.out.println(s1.pop());
    System.out.println(s1.pop());

    System.out.println(s1.peek());
    System.out.println(s1.pop());

  }
}
