package pkg04_two_dimension_ex;

import java.util.Arrays;

public class Ex01 {

  public static void main(String[] args) {

//    // 2단부터 9단까지 구구단 전체 결과를 2차원 배열에 저장하기
//    
//    int[][] gugudan = new int[8][9];
//    for(int i = 0; i < gugudan.length; i++) {
//      for(int j = 0; j < gugudan[i].length; j++) {
//        gugudan[i][j] = (i+2) * (j+1);
//      }
//    }
//  
//    for(int i = 0; i < gugudan.length; i++) {
//      System.out.print(i+2 + "단 : ");
//      for(int j = 0; j < gugudan[i].length; j++) {
//        System.out.print(String.format("%-4s",gugudan[i][j]));
//      }
//      System.out.println();
//    }

    int[][] gugudan = new int[8][9];
    for(int i = 0; i < gugudan.length; i++) {
      System.out.print(i+2 + "단 : ");
      for(int j = 0; j < gugudan[i].length; j++) {
        gugudan[i][j] = (i+2) * (j+1);
        System.out.print(String.format("%3d",gugudan[i][j]));
      }
      System.out.println();
    }
    
  
  
  }

}
