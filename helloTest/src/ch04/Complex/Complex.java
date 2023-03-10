package ch04.Complex;

public class Complex {
  double first;
  double second;

  Complex(double n1, double n2) {
    this.first = n1;
    this.second = n2;
  }

  Complex(double n1) {
    this.first = n1;
    this.second = 0.0;
  }

  void print() {
    System.out.printf("%s + %si\n",first,second);
  }
}
