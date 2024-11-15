package pkg01_string;

import java.util.Arrays;

public class Class01_String {
  
  public static void method1() {
    System.out.println("-------------------method1-------------------");

    // String 은 불변 객체(Immutable)이다.
    // String 연산자 사용시 성능 떨어짐 StringBuilder 사용
    
    String str = "a";
    str += "b";  // 실행시 "a", "b", "ab" 3개가 만들어지고 ab에 참조값지정되고 a,b는 쓰래기가됨
    str += "c";// 실행시 "a", "b", "ab", "c", "abc" 5개가 만들어지고 abc에 참조값지정되고 a,b,ab,c는 쓰래기가됨
    
    System.out.println(str);
    
  }
  
  public static void method2() {
    System.out.println("-------------------method2-------------------");
    
    // String Literal : "문자열"
    // String Literal 은 JVM 이 관리한다. -> 동일한 Literal 은 재사용한다.
    
    /*
     *  ┌--------------┐
     *  │  0x12345678  │ str1
     *  │--------------│
     *  │  0x12345678  │ str2
     *  │--------------│
     *  │      ...     │
     *  │--------------│
     *  │       a      │ 0x12345678
     *  │--------------│
     *  │      ...     │
     *  └--------------┘
     */
    
    String str1 = "a";
    String str2 = "a";
    
    System.out.println(System.identityHashCode(str1));  // 참조 값 확인
    System.out.println(System.identityHashCode(str2));  // 참조 값 확인
    
    // str1 == str2 -> ture 참조값비교
    
  }
  
  public static void method3() {
    System.out.println("-------------------method3-------------------");
    
    // 문자열 객체 : new String("문자열")
    // 문자열 객체는 개발자가 관리한다. -> 동일한 문자열 객체도 여러 개 생성될 수 있다.
    
    /*
     *  ┌--------------┐
     *  │  0x12345678  │ str1
     *  │--------------│
     *  │  0x98765432  │ str2
     *  │--------------│
     *  │      ...     │
     *  │--------------│
     *  │       a      │ 0x12345678
     *  │--------------│
     *  │      ...     │
     *  │--------------│
     *  │       a      │ 0x98765432
     *  │--------------│
     *  │      ...     │
     *  └--------------┘
     */
    
    String str1 = new String("a");
    String str2 = new String("a");
    
    System.out.println(System.identityHashCode(str1));  // 참조 값 확인
    System.out.println(System.identityHashCode(str2));  // 참조 값 확인
    
 // str1 == str2 -> false 참조값비교
    
  }
  
  public static void method4() {
    System.out.println("-------------------method4-------------------");
    
    // equals           : 같은 문자열이면 true 반환
    // equalsIgnoreCase : 같은 문자열이면 true 반환 (대소문자 무시한다.)
    
    String str1 = "a";
    String str2 = "A";
    
    System.out.println(str1.equals(str2));
    System.out.println(str1.equalsIgnoreCase(str2));
    
  }
  
  public static void method5() {
    System.out.println("-------------------method5-------------------");
    
    // length : 문자 개수 반환
    
    String str = "hello\n";
    
    System.out.println(str.length());   // "\n"은 줄바꿈을 나타내며, 하나의 문자로 간주되어 길이에는 1로 카운트됩니다.
    
  }

  public static void method6() {
    System.out.println("-------------------method6-------------------");
    
    // charAt : 지정한 인덱스(index)의 문자 반환
    
    String str = "hello";
    
    System.out.println(str.charAt(0));
    System.out.println(str.charAt(1));
    System.out.println(str.charAt(2));
    System.out.println(str.charAt(3));
    System.out.println(str.charAt(4));
    
  }
  
  public static void method7() {
    System.out.println("-------------------method7-------------------");
    
    // indexOf     : 전달한 문자열이 발견된 첫 번째 인덱스를 반환, 없으면 -1을 반환
    // lastIndexOf : 전달한 문자열이 발견된 마지막  인덱스를 반환, 없으면 -1을 반환
    
    String str = "hello world apple";
    
    System.out.println(str.indexOf(" "));
    System.out.println(str.lastIndexOf(" "));
    
  }
  
  public static void method8() {
    System.out.println("-------------------method8-------------------");
    
    // substring(int beginIndex)               : beginIndex 부터 끝까지 반환
    // substring(int beginIndex, int endIndex) : beginIndex 부터 endIndex 이전까지 반환
    
    String str = "hello world";
    
    int spaceIndex = str.indexOf(" ");
    
    System.out.println(str.substring(0, spaceIndex));   // 공백 이전의 부분 문자열을 출력합니다.
    System.out.println(str.substring(spaceIndex + 1));  // 공백 이후의 부분 문자열을 출력합니다.
    
  }
  
  public static void method9() {
    System.out.println("-------------------method9-------------------");
    
    // startsWith : 전달한 문자열로 시작하면 true 반환
    // endsWith   : 전달한 문자열로 끝나면   true 반환
    // contains   : 전달한 문자열을 포함하면 true 반환
    
    String str = "admin@example.com";
    
    System.out.println(str.startsWith("."));
    System.out.println(str.endsWith(".com"));
    System.out.println(str.contains("@"));  //컨텐츠
    
  }
  
  public static void method10() {
    System.out.println("-------------------method10-------------------");
    
    // isEmpty : 글자수가 0이면 true 반환
    // isBlank : 공백 문자이면  true 반환 (jdk 11 부터 사용 가능)
    
    String str = " ";
    
    System.out.println(str.isEmpty());  // false -> 글자수 0 여야 true //이즈엠티
    System.out.println(str.isBlank());  // true  
    
  }
  
  public static void method11() {
    System.out.println("-------------------method11-------------------");
    
    // trim : 문자열의 앞뒤에 포함된 공백 문자 제거
    
    String str = "\n hello \n";
    
    System.out.println(str.trim().length());
    
  }
  
  public static void method12() {
    System.out.println("-------------------method12-------------------");
    
    // replace    : 어떤 문자열을 다른 문자열로 변환한 문자열을 반환
    // replaceAll : 어떤 정규식 패턴을 다른 문자열로 변환한 문자열을 반환
    
    String str = "192.168.0.214";
    
    System.out.println(str.replace(".", "_"));
    System.out.println(str.replaceAll("\\.", "_"));  
    
    // 중요 이스케이프 문자 '\n', '\t', '\\', '\"'
    /*
    \n : 줄바꿈
    다음 문장을 새로운 줄에서 시작하게 합니다.

    \t : 탭 간격
    일정한 간격을 띄워 탭을 추가합니다.

    \\ : 역슬래시(\)
    역슬래시 자체를 문자로 출력합니다.

    \" : 큰따옴표(")
    큰따옴표 자체를 문자로 표현합니다.
    */
  }
  
  public static void method13() {
    System.out.println("-------------------method13-------------------");
    
    // split : 지정한 정규식 패턴으로 문자열을 분리한 String[] 을 반환
    // join  : String[] 의 모든 요소와 전달한 문자열을 연결한 문자열을 반환
    
    String str = "aaa.bbb.ccc.ddd.txt";
    
    // 문자열을 '.'을 기준으로 분리하여 배열에 저장
    String[] result = str.split("\\.");
    System.out.println(Arrays.toString(result));
    
    // 배열의 마지막 요소를 출력 (파일 확장자 부분)
    System.out.println(result[result.length - 1]);
    
    // 배열의 요소들을 '.'으로 다시 연결하여 원본 문자열로 출력
    System.out.println(String.join(".", result));
    
  }
  
  public static void method14() {
    System.out.println("\n-------------------method14-------------------\n");
    
    // toUpperCase : 대문자로 변환
    // toLowerCase : 소문자로 변환
    
    String str = "I am a Student";
    
    System.out.println(str.toUpperCase());
    System.out.println(str.toLowerCase());
    
  }
  
  public static void method15() {
    System.out.println("-------------------method15-------------------");
    
    // format : 형식이 적용된 문자열 반환
    
    // 실수 형식
    double number1 = 100.5;
    System.out.println(String.format("%f", number1));       // 기본 실수 형식 (소수점 이하 6자리)
    System.out.println(String.format("%.2f", number1));     // 소수점 이하 2자리까지만 표시
    System.out.println(String.format("%10.2f", number1));   // 전체 10자리로 맞추고 소수점 이하 2자리 표시 (앞쪽 빈 자리 공백 채움)
    
    // 정수 형식
    int number2 = 123;
    System.out.println(String.format("%o", number2));    // 8진수
    System.out.println(String.format("%x", number2));    // 16진수(0~f)
    System.out.println(String.format("%X", number2));    // 16진수(0~F)
    System.out.println(String.format("%d", number2));    // 10진수
    System.out.println(String.format("%5d", number2));   // 10진수
    System.out.println(String.format("%05d", number2));  // 10진수
    
    // 문자열 형식
    String str = "hello";
    System.out.println(String.format("%s", str));     // 기본 문자열 형식
    System.out.println(String.format("%10s", str));   // 오른쪽 정렬
    System.out.println(String.format("%-10s", str));  // 왼쪽 정렬
    
  }
  

  public static void practice01() {
    System.out.println("-------------------practice01-------------------");
    
    // /list.do 추출하기
    String uri = "http://localhost:8080/project/list.do";
    String contextPath = "/project";
    
    System.out.println(uri.substring(contextPath + 1)); 
    System.out.println(uri.lastIndexOf(contextPath));

    
  }
  
  public static void practice02() {
    System.out.println("-------------------practice02-------------------");
    
    // 앞으로 읽어도 뒤로 읽어도 동일한 문자열 판단하기
    
    String word = "wertyuiokl;o;p";
    
    // 1. 한 글자씩 비교하기
    /*
     * 1) 5글자인 경우 비교할 문자들의 인덱스 비교
     *    앞    뒤
     *    0     4
     *    1     3
     * 
     * 2) 6글자인 경우 비교할 문자들의 인덱스 비교
     *    앞    뒤
     *    0     5
     *    1     4
     *    2     3
     *    
     * 3) n 글자인 경우 비교할 문자들의 인덱스 비교
     *    앞    뒤
     *    i     n - i - 1
     */
    
    
    // 2. 거꾸로 문자열을 만들어서 비교하기

    
  }
  
  public static void main(String[] args) {
    method1();
    method2();
    method3();
    method4();
    method5();
    method6();
    method7();
    method8();
    method9();
    method10();
    method11();
    method12();
    method13();
    method14();
    method15();
    practice01();
    practice02();
  }
}


