package work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BIT_cp {
  public static void main(String[] args) throws Exception {
      FileInputStream input = null;
      FileOutputStream output = null;
          // 복사할 대상 파일을 지정해준다.
      File file = new File("src/work/temp/" + args[0]);

      // FileInputStream 는 File object를 생성자 인수로 받을 수 있다.         
      input = new FileInputStream(file);
      // 복사된 파일의 위치를 지정해준다.
      output = new FileOutputStream(new File("src/work/temp/" + args[1]));

      int readBuffer = 0;
      byte [] buffer = new byte[1024];
      while((readBuffer = input.read(buffer)) != -1) {
        output.write(buffer, 0, readBuffer);
      }
      
        System.out.println("파일이 복사되었습니다.");
  
      // 생성된 InputStream Object를 닫아준다.
      input.close();
      // 생성된 OutputStream Object를 닫아준다.
      output.close();
  }

}
