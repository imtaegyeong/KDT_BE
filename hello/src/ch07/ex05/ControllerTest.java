package ch07.ex05;

class TV extends Controller{

  public TV(boolean power){
    super(power);
  }
  @Override
  String getName() {
    return "TV";
  }
}

class Radio extends Controller{

  public Radio(boolean power){
    super(power);
  }
  @Override
  String getName() {
    return "Radio";
  }
}
public class ControllerTest {
  public static void main(String[] args){
    Controller[] c = { new TV(false), new Radio(true) } ;
    for (Controller controller : c)
      controller.show();
  }
}
