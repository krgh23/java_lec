package pkg05_Reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderEx {

  public static void a() {
  
    File file = new File("\\storage","a.txt");
    
    try (FileReader in = new FileReader(file)) {
    
      // 읽을 단위 : 2 글자씩 읽기
      char[] cbuf = new char[2];
      
      // 읽은 데이터를 저장할 StringBuilder
      StringBuilder builder = new StringBuilder();
      
      // 실제로 읽은 글자 수
      int readChar = 0;
      
      // read(char[]) : 읽은 글자들은 인자에 저장하고, 읽은 글자 수를 반환한다. 파일이 끝나면 -1 을 반환한다.
      while ((readChar = in.read(cbuf)) != -1) {
        builder.append(cbuf, 0, readChar);
        //builder.append(cbuf);  글자수만큼만하면 마지막에 "요"를 읽고 1개의 배열로 더하고 있어서 직전에 있던 "세"가 나와서 "안녕하세요세"가 출력된다.
      }
      
      // 확인
      System.out.println(builder.toString());
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    
  }

  public static void b() {
    
    File file = new File("\\storage", "b.html");
    try(BufferedReader in = new BufferedReader(new FileReader(file))) {
      
      // 읽은 단위 : String
      String line= null;
      
      // 읽은 데이터 저장할 StringBuilder
      StringBuilder builder = new StringBuilder();
      
      // BufferedReader 제일 많이 쓴다.
      // readLine() = BufferedReader 클래스에서 지원하는 메소드. 읽은 line 을 String 으로 반환하고, 파일이 끝나면 null 을 반환한다.
      // (한줄씩 읽어서 가져오지만 가져오는 정보에 줄바꿈은 포함되지 않는다.)
      while ((line = in.readLine()) != null) {
        builder.append(line);
      }
      
      // 확인
      System.out.println(builder.toString());
      
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  public static void c() {
    
    File file = new File("\\storage", "c.html");
    
    // InputStreamReader : 바이트 입력 스트림을 문자 입력 스트림으로 바꾸는 스트림(주로 network 에서 사용)
    try(BufferedReader in = new BufferedReader(new InputStreamReader( new FileInputStream(file)))) {
      
      // 읽은 단위 : String
      String line= null;
      
      // 읽은 데이터 저장할 StringBuilder
      StringBuilder builder = new StringBuilder();
      
      // BufferedReader 제일 많이 쓴다.
      // readLine() = BufferedReader 클래스에서 지원하는 메소드. 읽은 line 을 String 으로 반환하고, 파일이 끝나면 null 을 반환한다.
      // (한줄씩 읽어서 가져오지만 가져오는 정보에 줄바꿈은 포함되지 않는다.)
      while ((line = in.readLine()) != null) {
        builder.append(line + "\n");
      }
      
      // 확인
      System.out.println(builder.toString());
      
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
    
  
  public static void main(String[] args) {
    //a();
    //b();
    c();
    
    
    
  }

}
