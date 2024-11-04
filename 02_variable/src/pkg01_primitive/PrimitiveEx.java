package pkg01_primitive;

public class PrimitiveEx {

  public static void main(String[] args) {
    
    // Primitive Type (기본 타입)
    
    // 1. byte : 1바이트 정수 
    byte a; // 변수 a 에는 쓰레기(Garbage)가 저장되어 있음
    a = 127;  // -128 ~ 127 가능
    System.out.println(a);   // syso + ctrl.spacebar  빠르게 입력방법
    
    // 2. short : 2바이트 정수 - 사용안함
    short b = 32767;
    System.out.println(b);
    
    // 3. int(integer) : 4바이트 정수 - 기본 정수 타입
    int c = 2147483647;
    System.out.println(c);
    
    // 4. long : 8바이트 정수 - int 로 커버 불가능한 값에서 사용
    long d = 2147483648L;  // long 타입의 값은 마지막에 대/소문자 L(l) 을 추가 (int 범위를 벗어난 값은 필수, 아니면 생략가능)
                          // 일반적으로 대문자 L을 붙이고 자바개발자들은 일반적으로 값이 벗어나지 않아도 long에 전부 L을 붙인다
    System.out.println(d);
    
    // 5. float(floating-point) : 4바이트 실수저장 - 사용 안 함
    float e = 1.1111111111F; // float 타입의 값은 마지막에 F(f)를 추가
    System.out.println(e);
    
    // 6. double : 8바이트 실수 - 기본 실수 타입
    double f = 1.111111111;
    System.out.println(f);
    
    // 7. char(character) : 2바이트 단일 문자 - ASCII 코드(1바이트), 유니코드(2바이트)
    char g = '하'; // 작은따움표로 작성 큰따움표 불가, 영문/한글 모두 가능
    System.out.println(g);
    
    // 8. boolean : 이론상 1비트 (실제는 JVM이 담당), true 또는 false 저장
    boolean h = true;
    System.out.println(h);
      
  }

}
