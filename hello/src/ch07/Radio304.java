package ch07;

public class Radio304 extends Controller{

  Radio304(Boolean power) {
    super(power);
  }

  @Override
  String getName() {
    return "라디오";
  }
}
