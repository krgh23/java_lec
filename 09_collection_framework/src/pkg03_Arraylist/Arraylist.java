package pkg03_Arraylist;

import java.util.*; // 자바 유틸의 모든것 (아래 생략가능)
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

public class Arraylist {
  /**
   * Mutable 객체
   * 저장된 요소의 갯수를 변경할 수 있다.
   * 크기는 자동으로 조정된다.
   */
  public static void a() {
    
    // ArratList 선언 : 타입은 List 인터페이스 타입 사용
    // ctrl + shift + 알파벳"o" = 인터페이스 자동 생성 및 사용안하는 인터페이스 삭제
    List<String> members;
    
    // ArrayList 생성 : 제네릭 타입 생략 가능
    members = new ArrayList<String>();  // members = new ArrayList<>();  기본 크기 10
   
    // 요소 추가하기 (인덱스 0부터 순차적으로 추가된다.)
    members.add("제니");
    members.add("지수");
    members.add("태양");    
    members.add("리사");
    members.add("로제");
    
    // 요소 삭제하기 (삭제된 요소 자리로 이후 요소들이 이동한다.)
    members.remove(2);
    
    // 요소 수정하기
    members.set(0, "jenny");
    members.set(1, "jusu");
    members.set(2, "lisa");
    members.set(3, "rose");
    
    // 요소 전체확인
    System.out.println(members);
    
    // 요소 개별 확인
    System.out.println(members.get(0));
    System.out.println(members.get(1));
    System.out.println(members.get(2));
    System.out.println(members.get(3));
    
    // 요소 개수
    System.out.println(members.size());
    
  }
  
  /**
   * Immutable 객체
   * 저장된 요소의 갯수를 변경할 수 없다.
   * 저장된 요소의 값은 변경이 가능하다.
   */
  public static void b() {
    
    // (배열) 초기화를 이용한 ArrayList 생성
    
    List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
    
    // 요소 추가하기 (Immutable 임으로 실패한다.)
    // numbers.add(60);
    
    // 요소 삭제하기 (Immutable 임으로 실패한다.)
    // numbers.remove(0);
    
    // 요소 변경하기
    numbers.set(0, 100);
    
    // 전체 요소 확인
    System.out.println(numbers);
    
    
    
    
    
  }
  

  /*
   * for(초기화; 조건식; 증감식)
   *   반복할 코드 블록
   * 조건식 -> 코드 블록 -> 증감식 // 반복
   * 조건식에 무의미한 같은값의 메소드 호출을 하면 불필요한 연산이 누적되어 성능이 저하
   */
  
  public static void c() {
    String[] words = {"봄", "여름", "가을", "겨울"};
    List<String> seasons = Arrays.asList(words);
    
    // length 필드는 변수임으로 여러 번 참조해도 괜찮다. 
    for(int i = 0; i < words.length; i++) {                  // length 변수참조 
      System.out.println(words[i]);
    }
    
    // size() 메소드는 한 번만 호출할 수 있도록 초기화 영역에서 변수로 처리한다.
    for(int i = 0, size = seasons.size(); i < size; i++) {   // seasons.size()를 size 에 저장하여 한번만 호출할수있게 함
    //for(int i = 0; i < seasons.size(); i++) {              // size() 메소드 호출 : 같은 결과값의 메소드를 호출계속하면 안됨
      
      System.out.println(seasons.get(i));
    }
    
    
  }
  
  
  public static void main(String[] args) {
    
    a();
    b();
    c();

  }

}
