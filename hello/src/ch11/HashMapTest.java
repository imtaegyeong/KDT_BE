package ch11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
  public static void main(String[] args) {
    //immutable 불변의 객체 생성
    Map<String, String> m1 = Map.of("사자","lion","호랑이","tiger");
    //immutable 객체의 값을 가진 mutable 객체 생성
    Map<String, String> animal = new HashMap<>(m1);

    Set<String> keys = animal.keySet();
    for(String key : keys) {
      System.out.println(animal.get(key).toUpperCase());
    }

  }
}
