package pkg01_InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetEx {

  public static void main(String[] args) {

    // IP 주소 : 숫자로 된 호스트(서버)의 고유의 주소. IPv4. IPv6 두정류가 존재한다.
    // IPv4 : 1byte 숫자 4개로 구성되고 각 숫자를 점(.)으로 구분하는 주소 체계 (java byte : -128 ~ 127, IPv4 = 0~256)
    
    // 도메인 주소 : 문자로 된 호스트의 주소. IP 주소를 외우기 어려워서 개발된 주소이다.
    
    // DNS = Domain Name Server. 도메인 주소를 IP 주소로 바꾸어 주는 서버(서비스).
    
    
    try {
      
      InetAddress addr1 = InetAddress.getByName("google.com");
      System.out.println("IP 주소 : " + addr1.getHostAddress());
      System.out.println("도메인 주소 : " + addr1.getHostName());
      
      /*
       *  byte      IPv4
       * -128   =   128
       * -127   =   129
       * -126   =   130
       */
      
      InetAddress addr2 = InetAddress.getByAddress(new byte[] {(byte) 142,(byte) 250,71,(byte) 174});
      System.out.println("IP 주소 : " + addr2.getHostAddress());
      System.out.println("도메인 주소 : " + addr2.getHostName());
      
    } catch (UnknownHostException e) {
      e.printStackTrace();
    }
    
  }

  
}