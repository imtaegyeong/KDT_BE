package ch09;

class Ticket implements Comparable {
  String name;
  int price;

  public Ticket(String name, int price){
    this.name = name;
    this.price = price;
  }
  @Override

  public int compareTo(Object o) {
    if(o instanceof Ticket){
      Ticket t = (Ticket)o;
      int res = (price < t.price) ? -1 : ( (price > t.price) ? 1 : 0 );
      return res;
    }
    return -999;
  }
}

public class GenericMethod3Demo {
  public static void main(String[] args) {
    Ticket t = new Ticket("뮤지컬",3000);
    Ticket t1 = new Ticket("농구",3000);
    Object o = new Object();

    int res = t.compareTo(o);

    if(res == -999) {
      System.out.println("비교할 수 없습니다.");
      return;
    }
    if(res > 0)
      System.out.println(t.name + "티켓이 더 비쌉니다.");
    else if(res < 0)
      System.out.println(t1.name + "티켓이 더 비쌉니다.");
    else
      System.out.println("두 개의 티켓의 가격이 동일합니다.");
  }
}


//  public static <T extends Comparable> int countGT(T[] a, T elem) {
//    int count = 0;
//    for (T e : a)
//
//      if (e.compareTo(elem) > 0) ++count;
//    return count;
//  }
//  public static void main(String[] args) {
//    Ticket[] arr = { new Ticket(3),new Ticket(10), new Ticket(5), new Ticket(7), new Ticket(4) };
//    System.out.println(countGT(arr, arr[4]));
//  }
//}
