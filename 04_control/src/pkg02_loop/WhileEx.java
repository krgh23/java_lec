package pkg02_loop;

public class WhileEx {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    // 1,2,3,4,5 출력하기
    int a = 1;
    while(a <= 5) {
      System.out.println(a++);
    }
    
    // 1~10 사이 짝수 출력
    int b = 1;
    while(b <= 10) {
      if(b % 2 == 0) {
        System.out.println(b);
      }
      b++;
    }
    
    System.out.println("--------------");
    
    // 1~10 사이 홀수 누적하기
    int x = 1;
    int total = 0;
    while(x <= 10) {
        if(x % 2 == 1) {
            total += x;
            System.out.println(total);
        }
        x++;
    }
    
    
    
    
  }

}
