package ch11;

import java.util.Stack;

public class Stack2DEmo {
  public static void main(String[] args) {
    Stack<Integer> s1 = new Stack<>();

    s1.push(10);
    s1.push(20);
    s1.push(30);

    while(!s1.empty()){
      System.out.println(s1.pop());
    }

    s1.push(40);
    s1.push(50);
    s1.push(60);

//    for(int value : s1){
//      System.out.println("value = " + value);;
//    }

    s1.add(70);
    s1.add(80);
    s1.add(1,90);

    for(int value : s1){
      System.out.println("value = " + value);
    }
  }
}
