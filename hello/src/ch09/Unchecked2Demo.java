package ch09;

public class Unchecked2Demo {
  public static void main(String[] args) {
    int[] arr = {1,2,3};
    int[] arr2 = null;

    try {
      System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
      System.out.println(arr2.length);
    } catch (ArrayIndexOutOfBoundsException | NullPointerException e1) {
      System.out.println(e1.getMessage());
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("try-catch 종료");
    }
  }
}


//    try {
//        System.out.println(obj.length); // NullPointerException
//        System.out.println(obj2.length); // NullPointerException
//        System.out.println(5/0);
//        //System.out.println(obj3.length); // NullPointerException
//        } catch (NullPointerException |  ArithmeticException e2) {
//        System.out.println("null 객체를 참조했거나 0 으로 나눴습니다.");
//        System.out.println(e2.getMessage());
//        } finally {
//        System.out.println("종료");
//        }
//        System.out.println("프로그램 종료");