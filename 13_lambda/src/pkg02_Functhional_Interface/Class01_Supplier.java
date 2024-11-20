package pkg02_Functhional_Interface;

import java.util.function.Supplier;

/*
 * package java.util.function
 * 
 * @FunctionalInterface
 * public interface supplier<T> {
 *   T get();         // 데이터를 공급(반환)하는 추상 메서드
 * }
 */

public class Class01_Supplier {
  
  
  
  public static void main(String[] args) {
    
    // Lambda Expression  
    Supplier<String> supplier = () -> "hellow world";
    System.out.println(supplier.get());
    
    // 타입이 Supplier 인 매개변수로 Lambda Expression 전달 
    a(()-> 10);
    
  }
  
  public static void a(Supplier<Integer> supplier) {
    System.out.println(supplier.get());
  }
  
    
}
