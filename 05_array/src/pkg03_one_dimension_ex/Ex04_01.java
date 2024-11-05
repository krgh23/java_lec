package pkg03_one_dimension_ex;

import java.util.Arrays;

public class Ex04_01 {

  public static void main(String[] args) {
    
    // 10진수를 2진수로 변환한 결과를 배열에 저장하기

    // 10진수
    int number = 35;            // 2 | 35
                                //   └----
                                // 2 | 17  ... 1 → binary[0]
                                //   └----
                                // 2 |  8  ... 1 → binary[1]
                                //   └----
                                // 2 |  4  ... 0 → binary[2]
                                //   └----
                                // 2 |  2  ... 0 → binary[3]
                                //   └----
                                // 2 |  1  ... 0 → binary[4]
                                //   └----
                                //      0  ... 1 → binary[5]
    
    // 2진수                    //   ┌---------------------------------------┐
    int[] binary = new int[10]; //   | 1 | 1 | 0 | 0 | 0 | 1 | 0 | 0 | 0 | 0 |
                                //   └---------------------------------------┘
    int i = 0;
    while(i < binary.length) {
      if(number % 2 == 0) {
        binary[i] = 0;
      } else {
        binary[i] = 1;
      }
      number = number / 2;
      i++;
    }
    
    System.out.println(Arrays.toString(binary));

    System.out.println("-----------------");

    
    for(int k = 0 ; k < binary.length / 2 ; k++) {

//      int b = binary[binary.length - 1 - k];
// 
//      int temp = binary[k];
//      binary[k] = b;
//      b = temp;
      
      
      int temp = binary[k];
      binary[k] = binary[binary.length - 1 - k];
      binary[binary.length - 1 - k] = temp;
          
    }
    
        
    System.out.println(Arrays.toString(binary));
    
  }

}