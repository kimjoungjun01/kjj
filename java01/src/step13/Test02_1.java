package step13;

//nested class(=inner class)

public class Test02_1 {
  static int v1;

  static void m1() {}
  
  static class A {
    int a;
  }
  
  //non static nested class
  class B {}
  
  public static void main(String[] args) {
    //static context(스태틱 블록)안에서는 static 멤버를 사용할 수 있다
    v1 = 10;
    m1();
    A obj = new A();
  }
  
  
  public void test() {
    v1 = 20;
    //인스턴스 블록에서도 static 멤버를 사용할 수 있다
    //why? 인스턴스가 생성되려면 클래스가 로딩되어야하고, 클래스가 로딩될 때 스태틱 멤버가 모두 준비를 완료하기 떄문
    //그래서 인스턴스를 사용할 때 이미 스태틱멤버가 존재한다.
    m1();
    
    A obj = new A();
  }
}
