package step01;
public class Test10 {
  public static void main(String[] args) {
   char c1 = 44032; //한글 '가'의 유니코드 값
   System.out.println(c1);
   
   char c2 = 0xAC00; //한글 '가'의 유니코드 값
   System.out.println(c2);
   
   char c3 = '헐'; // '헐'의 유니코드 값을 리턴한다
   System.out.println(c3);
   
   char c4 = '\uAC00'; // '가' 의 유니코드 값을 리턴한다 
   System.out.println(c4);
  }
}

/*
 * 유니코드 
 * => 자바에서 문자를 다룰 때 2바이트 유니코드 값을 사용한다
 */
