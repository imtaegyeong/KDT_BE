package ch07;

public class TV304 extends Controller{

  TV304(Boolean power) {
    super(power);
  }

  @Override
  String getName() {
    return "TV";
  }
}
