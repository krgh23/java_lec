package pkg01_string;

public class Class02_StringBuilder {

  /*
   *         | StringBuffer    | StringBuilder
   * --------|-----------------|--------------
   *  since  | JDK 1.0         | JDK 1.5
   *  thread | multiple thread | single thread
   *  speed  | slow            | fast
   *  
   *  - StringBuffer는 멀티스레드 환경에서 안전하게 사용할 수 있으나 속도가 상대적으로 느립니다.
   *  - StringBuilder는 단일 스레드 환경에서 빠른 문자열 처리에 적합합니다.
   */
  
  public static void main(String[] args) {
    
    // StringBuilder 객체 생성 (String 문자열 연결보다 효율적)
    StringBuilder builder = new StringBuilder();
    
    // 문자열 추가하기 ,  builder 는 String 클래스가 아님
    builder.append("바");
    builder.append("나");
    builder.append("나");
    
    // String 객체로 바꾸기 (builder는 String이 아니므로 변환이 필요)
    // 1. new String(builder)
    // 2. builder.toString()
    
    String result = builder.toString();
    System.out.println(result);

  }

}
