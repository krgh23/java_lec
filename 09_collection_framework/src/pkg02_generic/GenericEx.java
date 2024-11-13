package pkg02_generic;

public class GenericEx {

  public static void main(String[] args) {

    // 정수 저장 container
    Container<Integer> containr1 = new Container<Integer>();
    containr1.setItem(10);
    System.out.println(containr1.getItem());
    
    // 실수 저장 Container
    Container<Double> container2 = new Container<Double>();
    container2.setItem(10.5);
    System.out.println(container2.getItem());
    
    // Car 저장 Container
    Container<Car> container3 = new Container<Car>();
    container3.setItem(new Car("bmw", "x7"));
    System.out.println(container3.getItem().getBrand());
    System.out.println(container3.getItem().getModel());
    System.out.println(container3.getItem());
    
        
        
  }

}
