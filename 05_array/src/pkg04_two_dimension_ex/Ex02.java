package pkg04_two_dimension_ex;

import java.util.Arrays;

public class Ex02 {

  public static void main(String[] args) {

    // 각 층에 거주하는 인원 수 출력하기
    // 1층 : 7명
    // 2층 : 7명
    // ...
    
    
    int[][] apt = {
        {2, 5},     // 1 층에 2명, 5명 거주
        {3, 4},
        {1, 4}, 
        {2, 3},
        {3, 3}
    };

    for(int i = 0; i < apt.length; i++) {
      System.out.print(i+1 + " 층 거주민 : ");
      int sum = 0;
      for(int j = 0; j < apt[i].length; j++) {
        sum += apt[i][j];
      }
      System.out.println(sum + "명");
    }
    

    
//    for(int i = 0; i < apt.length; i++) {
//      int total = 0;
//      for(int j = 0; j < apt[i].length; j++) {
//        total += apt[i][j];
//      }
//      System.out.println((i+1) + "층 : " +total + "명");
//    }

  }

}
