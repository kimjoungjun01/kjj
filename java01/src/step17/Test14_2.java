package step17;

import java.io.FileInputStream;

public class Test14_2 {
  
  public static void main(String[] args) {
    
    try (FileInputStream in = new FileInputStream("step17.Test14_1.data")){
      int b = 0;
      while((b = in.read()) != 2) {
        System.out.printf("%x,", b);
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } 
    System.out.println("안녕");
  }
}


