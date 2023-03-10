package ch09;

class Box<T> {
  T box;

  public T getBox() {
    return box;
  }

  public void setBox(T box) {
    this.box = box;
  }
}

public class BoxTest {
  public static void main(String[] args) {
    Box<Integer> bx1 = new Box<>();
    bx1.setBox(5);
    System.out.println(bx1.getBox());

    Box<String> bx2 = new Box<>();
    bx2.setBox("5a");
    System.out.println(bx2.getBox());
  }

}
