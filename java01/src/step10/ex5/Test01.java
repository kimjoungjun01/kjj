package step10.ex5;

public class Test01 {

  public static void main(String[] args) {
    A obj1 = new A();
    obj1.m1();

    A obj2 = new B();
    obj2.m1();
    
    A obj3 = new C();
    obj3.m1();
    
    B obj4 = new C();
    obj4.m1();
    obj4.m2();
    
  }

}
