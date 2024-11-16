package pkg01_File;

import java.io.File;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.w3c.dom.xpath.XPathNamespace;

/*
 * java.io.File 클래스
 * 1. 디렉터리/파일의 정보(이름, 경로, 크기, 최종 수정일 등)를 확인할 수 있다.
 * 2. 디렉터리/파일을 만들거나 삭제할 수 있다.
 * 
 */
 
/*
 * 디렉터리파일 경로 작성
 * 1. 경로 구분자(separtor)
 *  1) window : \\
 *  2) linux  : /
 *  3) mac    : /
 *  4) file. separator 필드를 사용하면 플랫폼에 따라서 자동으로 경로 구분자를 넣어 준다.
 * 2. 디렉터리
 *   1) 현재 디렉터리 : .
 *   2) 상위 디렉터리 : ..
 *   3)   홈 디렉터리 : ~  - linux  
 *   4) 루트 디렉터리 : /  - linux
 */

public class FileEx {
  
  public static void a() {
    
    // 디렉터리 만들기
    
    // File 인스턴스 생성 (디렉터리 경로와 이름을 작성해야 함)
    File dir = new File("D:\\storage");
    
    // 디렉터리가 없으면 만들기 ( !.exists 파일이 없으면)
    if( !dir.exists() ) {
      dir.mkdirs();    // 파일을 1개만 만들든 2개이상 만들든 항상 .mkdirs(Make Directory 약자) 사용
    }
    
    //확인
    System.out.println(dir.getName() + " 디렉터리가 생성되었습니다.");
    
  }
  
  public static void b() {
    
    // 디렉터리 삭제하기
    
    // File 인스턴스 생성
    File dir = new File("D:\\storage(지울것)");

    // 디렉터리가 있으면 삭제하기 : 비어있는 디렉터리만 삭제할 수 있다.(폴더가 지워지려면 폴더 내부가 비워있어야 된다.)
    if( dir.exists() ) {
      dir.delete();           // JVM(Java Virtual Machine)이 실행중이어도 삭제한다.
      // dir.deleteOnExit();  // JVM이 종료 되면 삭제한다
    }
    
    // 확인
    System.out.println(dir.exists() ?  "삭제 실패" : "삭제 성공" );

  }
  
  
  
  public static void c() {
    
    // 디렉터리/파일 정보 확인 (C:\Program Files\Java\jdk-17)

    // File 인스턴스 생성
    File javaHome = new File("C:\\Program Files\\Java\\jdk-17");

    // 하위 디렉터리.파일을 모두 file 인스턴스로 가져오기
    File[] files = javaHome.listFiles();
    
    System.out.println(files.length);
    
    for(File file : files) {
      StringBuilder builder = new StringBuilder();
      
      // 이름
      builder.append(String.format("%-20s", file.getName().substring(0, Math.min(file.getName().length(), 20))));
      
      // 수정한 날짜
      long lastModified = file.lastModified();
      builder.append(String.format("%-30s", new SimpleDateFormat("yyyy-MM-dd a h:mm").format(lastModified)));
      
      // 유형
      builder.append(String.format("%-10s", file.isFile() ? "파일" : "파일폴더"));
      
      // 크기
      long size = file.isDirectory() ? 0 : file.length();
      if(size != 0) {
        long kbSize = (long)Math.ceil(size / 1024.0);
        builder.append(String.format("%10s", new DecimalFormat("#,##0").format(kbSize)) + "KB");
      }
      
      // 출력
      System.out.println(builder.toString());
      
    }
    
  }

  //예제
  public static void d() {
    /* D:\\2024\\11\15 디렉터리 만드릭 실습(오늘날짜 내일만들면 내일날짜) */
    
    String pathname = "D:\\" + DateTimeFormatter.ofPattern("yyyy\\MM\\dd").format(LocalDate.now());  // LocalDate.now() 오늘 날짜
    File dir = new File(pathname);
    if( !dir.exists() )
      dir.mkdirs();
      System.out.println(dir.getPath() + " 디렉터리가 생성되었습니다.");
  }
  
    

  //recursive call 재귀호출 (종료시점을 잘 설정 필요. 무한회귀함)
  public static void e(String pathname) {
    
    /* D:\\2024 디렉터리 삭제 실습 */
    /*
     * D:\\2024\\11\\15 삭제 -> e("D:\\2024\\11\\15")
     * D:\\2024\\11     삭제 -> e("D:\\2024\\11")
     * D:\\2024         삭제 -> e("D:\\2024")
     *                       -> e("D:")  종료시점 (상위 디렉터리가 없으면 종료)
     */
    
    
    File dir = new File(pathname);
    File parent = dir.getParentFile();
    if(parent == null) {
      System.out.println("종료");
      return;
    }
    
    System.out.println(dir.getPath() + " 디렉더리를 삭제합니다. ");
    dir.delete();
    
    e(dir.getParent());
    
    
  }
    
    

  
  public static void main(String[] args) {
    //a();
    
    //b();
    
    c();
    
    //d();
    
    //e("D:\\2024\\11\\15");
    
  }

}