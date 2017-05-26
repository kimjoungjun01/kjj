package step17;

import java.io.FileInputStream;

public class Test14_1 {
  
  public static void main(String[] args) {
    FileInputStream in = null;
    try {
      in = new FileInputStream("step17.Test14_1.data");
      int b = 0;
      while((b = in.read()) != 2) {
        System.out.printf("%x,", b);
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      try {in.close();} catch (Exception e) {/*무시*/}
    }
    System.out.println("안녕");
  }
}


