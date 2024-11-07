package pkg10_BankAccount;

public class BankAccountEx {

  public static void main(String[] args) {
    
    // BankAccount 타입의 인스턴스 2개 생성하기
    BankAccount myAcc = new BankAccount("010-1111-1111", 500_000);       // 숫자에서 .대신 _ 사용가능 필수값아님
    BankAccount momAcc = new BankAccount("010-9999-999", 1_000_000);
   
    momAcc.transfer(myAcc, -100_000);
    momAcc.transfer(myAcc, 10_000_000);
    momAcc.transfer(myAcc, 100_000);
    
    myAcc.inquiry();
    momAcc.inquiry();
    
  }

}
