package pkg02_URL;

import java.net.MalformedURLException;
import java.net.URL;

public class URLEx {

  public static void main(String[] args) {
    
    try {
      
      // URL 인스턴스 생성
      URL url =  new URL("https://www.example.com:8080/blog/list?page=1&sort=DESC#memo");
      
      // URL 파싱(분석)하기
      System.out.println("https://www.example.com:8080/blog/list?page=1&sort=DESC#memo");
      System.out.println(" 프로토콜 : " + url.getProtocol());  // https
      System.out.println(" //호스트 : " + url.getHost());      // www.example.com
      System.out.println(" :포트 : " + url.getPort());         // 8080
      System.out.println(" /패스 : " + url.getPath());         // blog/list
      System.out.println(" ?쿼리 : " + url.getQuery());        // page=1&sort=DESC
      System.out.println(" /파일 :  " + url.getFile());        // blog/list?page=1&sort=DESC
      System.out.println(" #레퍼런스 : " + url.getRef());      // memo  // id값
    
    
    
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }
    
    
    
  }

}
