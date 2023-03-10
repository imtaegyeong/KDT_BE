package ch05;

public class ConstantDemo {
  public static void main(String[] args) {
    final int MALE = 0;
    final int FEMALE = 1;
    final int SOUTH = 1;
    final int NORTH = 2;
    int gender = SOUTH;

    if (gender == MALE){
      System.out.println(MALE + "은 병역의 의무가 있다.");
    }else{
      System.out.println(FEMALE + "은 병역의 의무가 없다.");
    }
    System.out.println(FEMALE == SOUTH);
  }

}
