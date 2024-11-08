package pkg03_constructor;

public class Person {

  private String name;
  
  // 디폴트 형식의 생성자는 우선 만들어 놓고 시작한다. (언제 어디서 사용될지 몰름)
  // 다른 생성자가 존재하는 경우 디폴트 생성자는 자동으로 생성되지 않음으로 직접 만들어야 한다.
  public Person() {
    
  }
  
  public Person(String name) {
    super();
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  
  
}