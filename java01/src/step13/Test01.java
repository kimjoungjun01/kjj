package step13;

//nested class(=inner class)

public class Test01 {
  //static nested class
  static class A {}
  
  //non static nested class
  class B {}
  
  public static void main(String[] args) {
    //local class
    class C {}
    
    //anonymous class
    Object obj = new Object() {};
    
    //lamda 로 nested 클래스 표현
    Runnable obj2 = () -> {};
  }
}
