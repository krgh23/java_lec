package pkg07_access_modifier;

/*
 * 정보 은닉
 * 객체(인스턴스)가 가진 정보(데이터, 정확히 필드)는 안전하게 보호한다.
 * 외부에서는 접근할 수 없도록 막는다.
 */

/*
 * 접근 권한
 * 1. public    : 누구나 접근가능 (클래스, 메소드의 권한)
 * 2. protected : 동일 패키지 or 상속 관계의 클래스에서 접근 가능
 * 3. default   : 동일 패키지에서 접근 가능 (접근권한이 없는 경우 사용됨)
 * 4. private   : 동일 클래스에서 접근가능 (필드의 권한)
 */

public class Sample {

  private String item;

  public void setItem(String item) {
    this.item = item;
  }
  
  
  
  
  
  
  
  
  
  
  
}
