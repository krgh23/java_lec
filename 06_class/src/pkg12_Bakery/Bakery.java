package pkg12_Bakery;

public class Bakery {

  private int bread;   // 빵갯수
  private int price;   // 빵가격
  private int money;   // 자본금
  
  
  public Bakery(int bread, int price, int money) {
    super();
    this.bread = bread;
    this.price = price;
    this.money = money;
  }

  
  public int getBread() {
    return bread;
  }

  public void setBread(int bread) {
    this.bread = bread;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }
  
  /**
   * 판매처리
   * @param money 고객이 낸 돈
   * @param bread 고객이 사려는 빵의 갯수
   * @return 판매할 빵의 갯수와 잔돈
   */
  public BreadNChange sell(int money, int bread) {
    // 판매할 빵이 부족한상황
    if(this.bread < bread) {
      System.out.println("빵이 부족하다.");
      return null;
    }
    // 고객이 낸 돈이 부족한 상황
    if(money < bread * price) {
      System.out.println("돈 더주세요");
      return null;
    }
    //판매처리
    this.money += bread * price;
    this.bread -= bread;
    
    
    //반환
    return new BreadNChange(bread, money - bread * price);
    
  }
  
  
  
  
  
  
  
  
  
}