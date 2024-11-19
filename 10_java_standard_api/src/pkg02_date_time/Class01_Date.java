package pkg02_date_time;

// Date 클래스를 사용하여 현재 날짜와 특정 시간 값을 출력하는 예제
import java.util.Date;

public class Class01_Date {

  public static void main(String[] args) {
    
    // 현재 시간(시스템 시간)을 기준으로 Date 객체를 생성
    Date date1 = new Date();
    System.out.println(date1); // 현재 날짜와 시간이 출력됨
    
    // 1970년 1월 1일 00:00:00 GMT를 기준으로 30일(밀리초 단위) 후의 날짜 생성
    // 1000 밀리초 = 1초, 60초 * 60분 * 24시간 * 30일 = 밀리초 단위로 30일
    Date date2 = new Date(1000 * 60 * 60 * 24 * 30L);  // L은 long 타입 명시
    System.out.println(date2); // 1970-01-31 날짜가 출력됨

  }

}
