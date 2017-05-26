package step11;

import step11.ex1.A;

public class Test04 extends A{
  
  public void test() {
//    this.v1 = 1; private
//    this.v2 = 2;(default)
    this.v3 = 3;//protected 자식클래스라 가능
    this.v4 = 4;//public
  }
  public static void main(String[] args) {
    A obj = new A();
//    obj.v1 = 1;private
//    obj.v2 = 2;(default)
//    obj.v3 = 3;protected
    obj.v4 = 4; // public
  }
}
