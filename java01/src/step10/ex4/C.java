package step10.ex4;

public class C extends B{
  int c ;
  
  public void m2() {
    System.out.println("C.m2()");
  }
  
  public void m3() {
    System.out.println("C.m3()");
  }
  
  public void m5() {
    System.out.println("C.m5()");
  }
  
  public void test1() {
    m1();
    m2();
    m3();
    System.out.println("-------------------------");
  }
  
  //super 는 수퍼클래스 호출이 아니다
  //재정의 하기전의 메서드를 말하는것!
  //조상클래스에서 메서드를 맞는다
  //그 중 가장 가까이에있는 메서드를 가리킨다
//  자신을 뺀 조상 클래스로 따라 올라가면서 메서드를 찾는다.
  public void test2() {
    super.m1();
    super.m2();
    super.m3();
    m4();
    super.m4();
    m5();
//    super.m5(); 재정의하거나 상속받은 메서드가 아니여서 오류
    //조상 중에 m5() 메서드가 없다.
    
    System.out.println("-------------------------");
  }
} 
