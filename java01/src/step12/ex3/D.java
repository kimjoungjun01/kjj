package step12.ex3;

public class D {
//  상수값을 정의하고 싶을 때
//  보통 클래스 변수를 상수 변수로 만든다
//  상수변수는 보통 외부에 완전 공개한다
//  상수변수임을 직관적으로 알 수 있도록 변수명을 대문자로 작성한다
//  그리고 단어와 단어 사이에는 밑줄을(.) 긋는다
  public static final int LEVEL_GUEST = 0;
  public static final int LEVEL_MEMBER = 1;
  public static final int LEVEL_ADMIN = 0;
  
  public void m1(final int a, final String b, final Object obj, final boolean c) {
    
    //final로 선언된 파라미터는 내부에서 변경 불가
    //오직 조회용
    a = 20;
    b = "hello";
    obj = new java.util.Date();
    c = true;
  }
}
