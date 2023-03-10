package ch09.ex07;

class Box<T> {
  T box ;
  public T getBox() {
    return box;
  }
  public void setBox(T box) {
    this.box = box;
  }
}
public class BoxTest {
  public static void main(String[] args) {
    Box<Integer> b = new Box<>();
    b.setBox(100);
    System.out.println(b.getBox());
    Box<String> b1 = new Box<>();
    b1.setBox("abc");
    System.out.println(b1.getBox());
  }
}
