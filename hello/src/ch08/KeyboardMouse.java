package ch08;

public class KeyboardMouse {

}

class Mouse{
  String name;

  public Mouse(String name){
    this.name = name;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Mouse){
      Mouse m = (Mouse) obj;
      return name.equals(m.name);
    }

    return false;
  }

  @Override
  public String toString() {
    return name + " 마우스 입니다.";
  }
}

class Keyboard{
  String name;

  public Keyboard(String name){
    this.name = name;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Keyboard){
      Keyboard m = (Keyboard) obj;
      return name.equals(m.name);
    }

    return false;
  }

  @Override
  public String toString() {
    return name + " 키보드 입니다.";
  }
}
