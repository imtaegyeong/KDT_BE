package ch04.Line;

import java.util.Objects;

public class Line {
  int leng;
  int thick;

  Line(int leng, int thick) {
    this.leng = leng;
    this.thick = thick;
  }

  boolean isSame(Line l) {
    return this.leng == l.leng;
  }

  @Override
  public int hashCode() {
    return Objects.hash(leng, thick);
  }

  @Override
  public boolean equals(Object obj) {
    Line line = (Line) obj;
    return (this.leng == line.leng && this.thick == line.thick);
  }
}
