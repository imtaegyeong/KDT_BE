package ch11.ex06;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1Test {
  public static void main(String[] args) {
    // 팩토리 메서드 - 객체가 수정불가 (immutable 객체)
    //Map<String, String> m1 = Map.of("호랑이","tiger", "사자", "lion", "표범", "leopard");
    // 수정 가능한 map
    Map<String, String> m2 = new HashMap<>();
    m2.put("호랑이","tiger");
    m2.put("사자", "lion");
    m2.put("표범", "leopard");
    System.out.println("변경전 : " + m2);

    Set<String> strings = m2.keySet();  // { 호랑이, 사자, 표범 }
    for(String k : strings){
      String animal = m2.get(k).toUpperCase();
      System.out.println("k, animal = " + k + ":" +animal);
      m2.put(k, animal);
    }
    System.out.println("변경후 : " + m2);
  }
}
