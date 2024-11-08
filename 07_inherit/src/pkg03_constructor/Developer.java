package pkg03_constructor;


public class Developer extends Person {

  private String[] skills;

  public Developer(String[] skills) {
    super();  // 부모 클래스의 기본 생성자인 public Person() { }을 호출합니다.
 // 생략해도 자동으로 호출되지만, 부모 클래스에 기본 생성자가 없으면 명시적으로 호출해야 합니다.
 // 이 경우 Person 클래스에 기본 생성자가 있어 생략해도 문제가 없습니다.
    this.skills = skills;
  }
  
  
  public Developer(String name, String[] skills) {
    // 생성자에서는 생성자만 부를수 있다.
    // 자식은 반드시 슈퍼 클레스의 생성자를 호출해야 한다.
    super(name); // public Person(String name) { } 생성자 호출! 
    this.skills = skills;
  }
  
  public String[] getSkills() {
    return skills;
  }

  public void setSkills(String[] skills) {
    this.skills = skills;
  }
  
  
  
}