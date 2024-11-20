package pkg03_Stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * package java.util.stream
 * 
 * public interface Stream<T> {
 *   Stream<T> filter(Predicate<T> predicate);  // Predicate 결과가 true 인 데이터만 Stream 으로 반환 (Lambda Expression)
 *   Stream<R> map(Function<T, R> mapper);      // Function 의 반환 결과를 Stream 으로 반환 (Lambda Expression)
 *   void forEach(Consumer<T> action);          // forEach 메소드를 호출한 Stream 의 모든 요소를 Consumer(전달o, 반환x) 로 하나씩 전달 한다.  (Lambda Expression)        
 * }                                            // Method Chaining : 객체의 메서드 호출이 연속적으로 연결될 수 있도록 하는 기법
 *                                                                   s.filter().map().filter().forEach()  // .forEach()는 void 임으로 호출하면 더 이상 체이닝불가
 */

public class StremEx {
  
  public static void a() throws Exception {
    
    // Stream 인스턴스 생성
    Stream<String> s1 = Stream.of("캥거루", "코알라", "이구아나", "펭귄");
    
    String[] array = {"사과", "바나나", "복숭아", "망고"};
    Stream<String> s2 = Arrays.stream(array);
    
    List<String> list = Arrays.asList("한국", "일본", " 중국", "베트남");
    Stream<String> s3 = list.stream();
    
    
    // forEach 메소드 활용
    s1.forEach(animal -> {
      System.out.println(animal);
    });
    s2.forEach(fruit -> System.out.println(fruit));
    s3.forEach(nation -> System.out.println(nation));
    
    
    // 연습. JAVA_HOME 의 모든 디렉터리/파일 이름출력하기
    File javaHome = new File("C:\\Program Files\\Java\\jdk-17");
    File[] files = javaHome.listFiles();
    Stream<File> s4 = Arrays.stream(files);
    s4.forEach(file -> System.out.println(file.getName()));
    
    
    File license = new File("C:\\Program Files\\Java\\jdk-17", "LICENSE");
    BufferedReader in = new BufferedReader(new FileReader(license));
    Stream<String> s5 = in.lines(); // 파일의 각 라인을 요소로 저장하고 있는 Stream
    
    
    StringBuilder builder = new StringBuilder();
    s5.forEach(line -> builder.append(line).append("\n"));
    System.out.println(builder.toString());
    in.close();
    
  }
  
  
  
  
  
  
  public static void b() {
    
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    /*
    numbers.stream().filter(Number -> {
      return Number % 3 == 0;
    });
    */
    numbers.stream()
      .filter(number -> number % 3 == 0) // Stream 요소 중 number % 3 == 0 결과가 true 인 요소(3의 배수)만 별도 stream 으로 반환한다.
      .forEach(number -> System.out.println(number));
    
    
    
    List<Fruit> fruits = Arrays.asList(
        new Fruit("단감", 1000), 
        new Fruit("포도", 2000),
        new Fruit("사과", 3000)
    );
    
    fruits.stream()
        .filter(fruit -> fruit.getPrice() >= 2000)
        .forEach(fruit -> System.out.println(fruit));
    
    // 연습.JAVA_HOME 의 모든 디렉터리 이름출력하기
    File javaHome = new File("C:\\Program Files\\Java\\jdk-17");
    Arrays.stream(javaHome.listFiles())
      .filter(file -> file.isDirectory())
      .forEach(dir -> System.out.println(dir.getName()));
    
  }
  
  
  public static void c() {
    
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    numbers.stream()
      .map(number -> number * number)
      .forEach(number -> System.out.println(number));
    
    List<Fruit> fruits = Arrays.asList(
        new Fruit("단감", 1000), 
        new Fruit("포도", 2000),
        new Fruit("사과", 3000)
    );
    
    fruits.stream()
      .filter(fruit -> fruit.getName().equals("포도")) // fruit.getName() == "포도" <-문자열 비교불가 .equals 로 비교해야 함
      .map(fruit -> new Fruit(fruit.getName(), fruit.getPrice() + 1000)) // 포도값에 1000원 인상
      .forEach(fruit -> System.out.println(fruit));
    
//    // 연습. JAVA_HOME 의 각 항목 이름 뒤에 "폴더", "파일" 추가해서 출력
//    File javaHome = new File("C:\\Program Files\\Java\\jdk-17");
//    Arrays.stream(javaHome.listFiles())
//      .map(item -> item.isDirectory() ? item.getName() + " 폴더" : item.getName( +" 파일"))
//      .forEach(item -> System.out.println(item));
    
  }

  public static void d() {
  
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    
    // Mutable List
    List<Integer> evenNumbers = numbers.stream()
        .filter(number -> number %2 == 0)
        .collect(Collectors.toList());
    evenNumbers.add(12); // 작업가능
    
    // Immutable List
    List<Integer> oddNumbers = numbers.stream()
        .filter(number -> number %2 == 1)
        .toList();
    // oddNumbers.add(11); // 작업불가
    
    evenNumbers.stream().forEach(number -> System.out.println(number));
    oddNumbers.stream().forEach(number -> System.out.println(number));
  }  
  
  
  
  public static void main (String[] args) throws Exception {
    //a();
    //b();
    //c();
    d();
  }

}
