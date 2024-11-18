package pkg06_byte_copy;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


//지울것 필요없는 파일임 
public class ByteCopyEx2 {

  public static void main(String[] args) {

    File file = new File("D:\\dev_lec\\tools","eclipse-jee-2023-09-R-win32-x86_64");
    File dir = new File("D:\\storage");

    File file2 = new File(dir, "copy.zip");
    FileOutputStream out = null;

    
    BufferedInputStream in = null;
    
    try {
      
      in = new BufferedInputStream(new FileInputStream(file));
      
      int c;
      
      byte[] b = new byte[(int) file.length()];
      int i = 0;
      
      while((c = in.read()) !=-1) {
        b[i++] = (byte) c; 
      }
      out = new FileOutputStream(file2);    
      byte[] c2 = b;
      out.write(b);

        
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(in != null)
          in.close();
      } catch (IOException e2) {
        e2.printStackTrace();
      }
    }
    
  }

}
