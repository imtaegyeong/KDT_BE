package ch05.StringTest;


public class ReturnC {

  static int CountChar(String s, char c) {
    int cnt = 0;

    for(int i = 0; i < s.length(); i++) {
      if(s.charAt(i) == c) {
        cnt+=1;
      }


    }

    return cnt;
  }

  public static void main(String[] args) {
    String s = "aabbccaaddssc";

  }

}
