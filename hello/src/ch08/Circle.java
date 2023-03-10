package ch08;

public class Circle {
  int radius;

  Circle(int radius) {
    this.radius = radius;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Circle) {
      Circle c = (Circle) obj;
      return this.radius == c.radius;
    }
    return false;
  }
}
