package pkg04_overloading;

import java.util.Arrays;

/*
 * 메소드 오버로딩
 * 1. 이름이 같은 메소드가 존재할 수 있다
 * 2. 매개변수가 달라야 한다.
 * 3. 반환타입은 연관이 없다.
 */

public class Sample {

  // void는 반환타입이라 달라도 상관없다
  // printArray 메소드가 같다
  // String, int 매개변수가 다르다.
  void printArray(String[] items) {
    System.out.println(Arrays.toString(items));
  }
  
  void printArray(int[] items) {
    System.out.println(Arrays.toString(items));
  }
  
  
}
