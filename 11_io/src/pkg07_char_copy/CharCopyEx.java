package pkg07_char_copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharCopyEx {

  public static void main(String[] args) {
    
 
    File origin = new File("C:\\Program Files\\Java\\jdk-17", "LICENSE");
    File copy = new File("D:\\storage", origin.getName());
    
    try (BufferedReader in = new BufferedReader(new FileReader(origin));
        BufferedWriter out = new BufferedWriter(new FileWriter(copy))) {
      
      String line= null;

      while ((line = in.readLine()) != null) {
        out.write(line + "\n");
      }
      
      System.out.println(copy.getPath() + " 파일이 복사되었습니다.");
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    
  }

}
