package ch03;

public class OverloadDemo {
  public static void main(String[] args) {
    int i1 =3, i2 = 5;
    double d1 = 3.2, d2 = 3.8;
    float f1 = 5.9f, f2 = 0.0f;

    System.out.println(max(i1,i2));
    System.out.println(max(d1,d2));
    System.out.println(max(f1,f2));

  }

  public static int max(int a, int b) {
    int result = (a > b) ? a : b;

    return result;
  }

  public static float max(float a, float b) {
    float result = (a > b) ? a : b;

    return result;
  }

  public static double max(double a, double b) {
    double result = (a > b) ? a : b;

    return result;
  }

}
