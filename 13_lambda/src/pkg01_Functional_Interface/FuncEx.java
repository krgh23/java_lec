package pkg01_Functional_Interface;

public class FuncEx {

  public static void main(String[] args) {

    // Anonymous Inner Type      
    // 인터페이스를 구현하는 클래스를 만들지 않고, 인터페이스 구현체가 반드시 해야 할 추상 메소드 오버라이드를 인스턴스 생성시 작성하는 방법
    
    /*
     * Lambda Expression
     * 1. Anonymous Inner Type 인스턴스 생성시 사용할 수 있는 새로운 표현식이다.
     * 2. 함수형 인터페이스 인스턴스 생성시 사용할 수 있다.
     * 3. 문법
     *   public interFace AA {
     *     void method(String param); 
     *   }
     *   
     *   1) Anonymous Inner Type
     *     AA a = new AA() {
     *       @override
     *       public void method(String s) {
     *       }
     *     };
     *   
     *   2) Lambda Expression
     *     AA a = (s) -> {
     *   
     *     }
     */
    
    
    // Lambda 는 함수형 인터페이스 일때만 쓴다.
    // Lambda Expression : 본문이 한개인경우 중괄호{} 생략 가능
    
    
    /*
    MyIntherfaceA a = new MyIntherfaceA() {      

      @Override                            // interface 는 추상메소드라 new MyIntherfaceA 하지 못함 -> 본문이 없어서 불가
      public void method() {               // 본문만 만들 수 있으면 new MyIntherfaceA 가능함 (@Override 필수)
        System.out.println("hello world");
      }
    };
     */
    MyIntherfaceA a = () -> System.out.println("hello world 1"); // JS 화살표함수와 동일 (), {}, return 등
   
    a.method();
    
    // Lambda Expression : 매개변수의 타입은 생략 가능
    //                     매개변수가 1개이면 소괄호() 생략 가능
    MyIntherfaceB b = param -> System.out.println(param);
    b.method("hello world 2");

    
    // Lambda Expression : 코드가 return 만 있으면 중괄호와 return 키워드 생략 가능
    // MyIntherfaceC c = () -> { return "hello world 3";};
    MyIntherfaceC c = () -> "hello world 3";
    System.out.println(c.method());
  }

}
