package ch04.Triangle;

public class Triangle {
  double underLine;
  double height;

  Triangle(double underLine, double height) {
    this.underLine = underLine;
    this.height = height;
  }

  public double getUnderLine() {
    return underLine;
  }

  public void setUnderLine(double underLine) {
    this.underLine = underLine;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double findArea() {
    return underLine*height*0.5;
  }

  public boolean isSame(Triangle t) {
//    if(t.findArea() == this.findArea()) {
//      return true;
//    } else {
//      return false;
//    }
//
    return t.findArea() == this.findArea();
  }
}

