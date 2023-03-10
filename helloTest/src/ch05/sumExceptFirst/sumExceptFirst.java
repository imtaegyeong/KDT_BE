package ch05.sumExceptFirst;

public class sumExceptFirst {

  static int sumExceptFirst(int i, int ... nums) {
    int sum = 0;

    for(int num : nums)
      sum+=num;

    return sum;
  }

  public static void main(String[] args) {
    int[] b = {1,2};
    int a = sumExceptFirst(1,b);
    System.out.println(a);
  }

}
