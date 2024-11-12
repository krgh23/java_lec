package pkg09_abstract;

public class AbstractEx {
  
  public static void main(String[] args) {
  
    // 추상 클래스의 인스턴스 생성은 불가능하다.
    // Animal animal = new Animal();
    Animal[] animals = new Animal[3];  // 배열 선언은 가능  
                                       // 이 배열은 Animal 의 객체를 담을 수 있는 공간만 만들 뿐 실제 Animal 객체를 생성하지는 않습니다
                                       //  따라서 Dog, Eagle, Shark 같은 Animal 의 하위 클래스 객체를 이 배열에 넣어 사용할 수 있습니다.
    animals[0] = new Dog();        
    animals[1] = new Eagle();        
    animals[2] = new Shark();        
     
    for(Animal animal : animals) {
      animal.move();
      
    }
    
    
  }
}
