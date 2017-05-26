package step04;

public class Test02_2 {
  enum Level {
    GUEST, MEMBER, ADMIN;
  }
  
  public static void main(String[] args) {
    byte b = 10;
    short s = 10;
    int i = 10;
    long l = 10;
    float f = 10f;
    double d = 10.0;
    boolean bool = true;
    char c = '가';
    
    //4바이트 크기의 '정수 값' 가능
    switch (b) {}
    switch (s) {}
    switch (i) {}
    switch (c) {}
//  switch (l) {} 8바이트 안됨 컴파일 오류
//  switch (f) {} 부동소수점 안됨 컴파일 오류
//  switch (d) {} 부동소수점 안됨 컴파일 오류
//  switch (bool) {} 불린값 안됨 컴파일 오류
    
    //문자열 (java 1.7부터 가능)
//    switch(str) {}
    
    //enum 타입(열거형) 가능 => 4바이트 정수값이다
    switch (Level.GUEST) {}
  }
}
