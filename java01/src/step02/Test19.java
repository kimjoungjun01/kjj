package step02;

public class Test19 {
  static int a = 10; //m1 과 main 등 여러 메서드에서 사용할수있다!
      
  public static void main(String[] args) {
    int a = 10;
    {
//      int a = 20; 블록 바깥 쪽에 존재하는 변수를 중복해서 선언할 수 없다.
      int b = 20;
      System.out.println(b);
      System.out.println(a);
    }
//  System.out.println(b); 블록안에서 선언한 변수는 블록을 벗어날시 제거된다.
  
  }  
} 
