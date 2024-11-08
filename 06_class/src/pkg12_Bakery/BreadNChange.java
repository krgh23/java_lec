package pkg12_Bakery;

public class BreadNChange {

  // 필드, 생성자, 메소드 순으로 만드는것이 암묵적약속
  
  private int bread;
  private int change;
  
  
  public BreadNChange(int bread, int change) {
    super();
    this.bread = bread;
    this.change = change;
  }


  public int getBread() {
    return bread;
  }


  public void setBread(int bread) {
    this.bread = bread;
  }


  public int getChange() {
    return change;
  }


  public void setChange(int change) {
    this.change = change;
  }
  
  
}
