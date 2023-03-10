package ch09;

class Beverage{
}
class Beer extends Beverage{
}
class Boricha extends Beverage{
}
class Cup<T> {
  private T beverage;
  public T getBeverage() {
    return beverage;
  }
  public void setBeverage(T beverage) {
    this.beverage = beverage;
  }
}

public class GenericClass1Demo {
  public static void main(String[] args) {
    Cup<Beer> c = new Cup<>();
    Cup<Boricha> c1 = new Cup<>();
    c.setBeverage(new Beer());
    Beer b = c.getBeverage();
    c1.setBeverage(new Boricha());
    Boricha b1 = c1.getBeverage();
  }
}
