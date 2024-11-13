package pkg06_custom_exception;

import java.io.Serial;

/**
 * 사용자 예외 클래스
 * 1. Exception 클래스를 상속한다.
 * 2. 클래스명이 Exception 으로 끝나도록 한다.
 */

public class MyException extends Exception{

  /**
   * 
   */
  @java.io.Serial                                                    // 디폴트 값이 있어서 안만들어도 됨
  private static final long serialVersionUID = 2044542506073587784L; // 디폴트 값이 있어서 안만들어도 됨
  
  // 예외 코드
  private int code;
  
  // constructor
  public MyException(String message, int code) {
    super(message);
    this.code = code;
  }

  // getter & setter
  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }
  

}
