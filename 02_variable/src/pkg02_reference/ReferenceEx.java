package pkg02_reference;

public class ReferenceEx {

  public static void main(String[] args) {

    // Reference (참조 타입)
    
    // String 클래스 : 주소 값(참조 값)을 저장하는 대표 참조 타입, 문자열 저장
    String s = "Hello World";
    System.out.println(s);                          // 실제로는 문자열 대신 참조값이 들어가 있지만 자바에서는 참조값을 바탕으로 문자열을 찾아서 보여줌
    System.out.println(System.identityHashCode(s)); // "Hello World" 문자열이 저장된 메모리의 참조값을 찾아 출력

     // ReferenceEx 클래스 타입 (6장부터 다룰 예정)
    ReferenceEx x = new ReferenceEx();
    System.out.println(x);

  }
}
