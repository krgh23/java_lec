package pkg03_return;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReturnEx {

  public static void main(String[] args) {

    // Sample 타입의 인스턴스 s 생성 
    //(인스턴스를 통해서 호출하는 것을 인스턴스 멤버)
    //(클래스로 호출하는것을 클래스 멤버 ex System.out // Arrays.toString)
    Sample s = new Sample();
    
    // mathodA 호출
    // 호출만 존재할 경우 반환이 없다.
    s.methodA(10);
    s.methodA(-5);
    
    // mathodB 호출 (1 전달 : 아메리카노 반환, 2 전달 : 카페라떼 반환, 3 전달 :  아인슈패너반환, 나머지 없는 메뉴 반환)
    // 호출 이외의 코드가 존재할경우 반환이 있다.
    System.out.println(s.methodB(1));
    System.out.println(s.methodB(2));
    System.out.println(s.methodB(3));
    System.out.println(s.methodB(4));

    // mathodC 호출 (배열을 반환 받아서 처리)
    String[] parts = s.methodC();
    System.out.println(Arrays.toString(parts));
  
    // mathodD 호출 (문자열을 반환 받아서 처리)
    String brand = s.methodD();
    System.out.println(brand);
    
    
    
  }

}
