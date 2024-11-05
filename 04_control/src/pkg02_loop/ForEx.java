package pkg02_loop;

public class ForEx {

  public static void main(String[] args) {

    // 5,4,3,2,1 출력하기
    for(int a = 5; a >= 1; a--) {
      System.out.println(a);
    }
    
    // 1~10 사이 홀수의 평균 (합계 / 개수)
    int total = 0, count = 0;
    for(int a = 1; a <= 10; a++) {
      if(a % 2 == 1) {
        total += a;
        count++;
      }
    }
    System.out.println((double) total / count);    // 계산할때 소수가 있으면 전부 소수로 변경된다.
    System.out.println(total / (double)count);     // 계산할때 소수가 있으면 전부 소수로 변경된다.
    System.out.println((double) (total / count));  // (total / count)먼저 나누어서 소숫점이 사라져서 잘못 계산됨
  
  
    // 3단 출력하기
    for(int a = 1; a <= 9; a++) {
      System.out.println("3 x " + a + " = " + (3*a));
    }
  }

}
