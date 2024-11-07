package pkg05_field;

/*
 * 필드
 * 1. 클래스에서 선언한 변수이다.
 * 2. 일반 변수와 달리 자동 초기화가 진행된다.(0, false, null)
 */

public class Car {
  // 암묵적 관례로 필드값은 클래스 초반에 넣어주고 이후 메소드를 작성한다
  int speed;  // int speed = 0;
  int fuel;   // int fuel = 0;
  final int LIMIT = 100;

  void accel() {
    if(fuel == 0)
      return;
    fuel--;
    if(speed == LIMIT)
      return;
    speed++;
  }
  
  void brake( ) {
    if(speed == 0)
      return;
    speed--;
  }
  
  void gasStation(int fuel) {
    // this : gasStation 메소드를 호출한 인스턴스(인스턴스의 참조값)
    // this 를 넣으면 현재 클래스 안에 있는 맴버를 호출할 수 있다.
    this.fuel += fuel;
  }
  
  void panel() {
    System.out.println("SPEED : " +  speed + ", FUEL : " + fuel);
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
}
