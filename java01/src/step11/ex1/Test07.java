package step11.ex1;

import step11.ex1.A;

public class Test07 extends A{
  

  public static void main(String[] args) {
    step11.ex1.A obj1 = new step11.ex1.A();
    
    //(default) 클래스는 같은패키지에서만 가능
    step11.ex1.B obj2 = new step11.ex1.B();
  }
}
