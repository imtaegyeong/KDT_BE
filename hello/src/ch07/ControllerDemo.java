package ch07;

public class ControllerDemo {
  public static void main(String[] args) {
    Controller[] c = {new TV304(false), new Radio304(true)};

    for( Controller controll : c) {
      controll.show();
    }
  }
}
