package pkg00_Bus.copy;

public class Bus {
  
  private Seat[] seats;
  private int numOfPerson;

  public Bus(int limit) {
    seats = new Seat[limit];
    for(int i = 0; i < limit; i++) {
      seats[i] = new Seat();
    }
  }
  
  // 버스 탑승 (빈 좌석 앞자리부터 채우기, 입석 금지)
  public void on(Person person) {
    
  }
  
  // 버스 하차 (내리는 사람의 좌석 번호를 이용해서 하차)
  public void off(int seatNo) {
    
  }
  
  
  // 버스 탑승 명단(1qjswhktjr : 홍길동, 2번 좌석 : 비어있음, ...)
  public void info( ) {
    
  }
  
  
}
