package step02;

import java.util.logging.LoggingMXBean;

public class Test02 {

  public static void main(String[] args) {
    byte b;    //1byte 크기의 메모리
    short s;   //2byte 크기의 메모리
    int i;     //4byte 크기의 메모리
    long l;    //8byte 크기의 메모리
    
    b = -128; // Byte.MIN_VALUE
    b = 127;  // Byte.MAX_VALUE
//  b = 128 //1바이트 크기를 넘기때문에 컴파일 오류
    
    s = -32768; // Short.MIN_VALUE
    s = 32767;  // Short.MAX_VALUE
    
    i = -2147483648; // Integer.MIN_VALUE
    i = 2147483647;  // Integer.MAX_VALUE
    
    l = -9223372036854775808L;
    l = Long.MIN_VALUE;
    
    l = 9223372036854775807L;
    l = Long.MAX_VALUE;
  }
}
