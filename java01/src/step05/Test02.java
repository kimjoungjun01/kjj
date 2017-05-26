package step05;

public class Test02 {
  
  public static void m1() {
    System.out.println("m1()");
  }
  
  public static void m2(int a, String str, boolean b) {
    System.out.printf("%d, %s, %b\n", a, str, b);
  }
  
  public static String m3() {
    
//    return 10; 문자열만 오도록 선언하였기떄문에 컴파일 오류
    return "Hello";//리턴 한다음에는 명령문이 올수없다
//    System.out.println("안된다");
  }
  
  public static int m4(int a) {
    return a * a;
  }
  
  public static void main(String[] args) {
    m1();
    m2(10, "홍길동", false);
    
    String value = m3();
    System.out.println(value);
    
    System.out.println(m4(10));
  }
}
