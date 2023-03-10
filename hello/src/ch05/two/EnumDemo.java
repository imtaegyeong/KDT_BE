package ch05.two;
public class EnumDemo {
  public static void main(String[] args) {
    Gender gender = Gender.FEMALE;
    if (gender == Gender.MALE) { // == , compareTo(+ , - , 0), equals
      System.out.println(Gender.MALE + "은 병역의 의무가 있다.");
    } else {
      System.out.println(Gender.FEMALE + "은 병역의 의무가 없다.");
    }
    for (Gender g : Gender.values()) {
      System.out.println(g);
      System.out.println(g.name());
      System.out.println(g.ordinal());
    }
  }
}
enum Gender {
  MALE("남성"), FEMALE("여성");
  private final String s;
  Gender(String s){
    this.s = s;
  }
  public String toString(){
    return s;
  }
}