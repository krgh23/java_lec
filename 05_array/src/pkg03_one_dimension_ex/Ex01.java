package pkg03_one_dimension_ex;

import java.util.Arrays;

public class Ex01 {

  public static void main(String[] args) {

    // 3단 구구단 결과 (3,6,9 ... 27 ) -> 배열에 저장하기
    
    // 3단 출력하기
    int[] dan3 =  new int[9];    
    for(int i = 1; i <= 9; i++) {
      dan3[i-1] = i * 3;
    }

    System.out.println(Arrays.toString(dan3));
    
  }
}