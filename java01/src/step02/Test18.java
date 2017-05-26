package step02;

public class Test18 {
  static int a = 10; //m1 과 main 등 여러 메서드에서 사용할수있다!
      
  public static void main(String[] args) {
    System.out.println(a);
    m1(30);
    System.out.println(a);
    
    int b = 20;//로컬 변수로 main() 메서드 안에서만 사용가능하다
  }
  
  public static void m1(int c) {
    //d = 50; 컴파일 오류 자바는 호이스팅이 없다 반드시 사용하려면 먼저 선언해야한다.
    int d = 40;//로컬 변수로 m1() 메서드 안에서만 사용가능
    a = 200;
//    b = 30; 컴파일 오류
  }
} 
