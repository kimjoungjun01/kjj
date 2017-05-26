package step02;

import java.util.logging.LoggingMXBean;

public class Test03 {

  public static void main(String[] args) {
    float f;   //4byte 크기의 메모리
    double d;  //8byte 크기의 메모리
    
    f = 9.999999f;
    System.out.println(f);
    
    f = 999999.9f;
    System.out.println(f);
    
    f = 9.9999997f;
    System.out.println(f);
    
    d = 3.14159234567f;
    System.out.println(d);

  }
}
