package pkg03_one_dimension_ex;

import java.util.Arrays;

public class Ex02 {

  public static void main(String[] args) {

    // 알파벳 대문자 ('A', 'B' ... 'Z') (26개 char) -> 배열에 저장하기
    
    char[] english =  new char[26];    
    for(int i = 0; i < english.length; i++) {
      english[i] = (char) ('A' + i);
    //english[i] = (char) (i + 65);
    }

    System.out.println(Arrays.toString(english));
    
    
    
  }

}
