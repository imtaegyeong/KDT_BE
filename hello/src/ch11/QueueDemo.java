package ch11;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueDemo {
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList();
    try { // control+ alt + T
      q.remove();
    } catch (NoSuchElementException e) {
      e.getMessage();
    }
    q.add(1);     q.add(2);     q.add(3);
    System.out.println(q.size());
//    System.out.println(q.poll());//    System.out.println(q.poll());
//    System.out.println(q.poll());//    System.out.println(q.size());
//    System.out.println(q.poll());//    System.out.println(q.peek());
//    try {
//      System.out.println(q.element());
//    } catch (NoSuchElementException e) {
//      e.getMessage();
//    }
    Iterator<Integer> iterator = q.iterator();
    while(iterator.hasNext()){
      System.out.println(iterator.next());
    }
  }
}
