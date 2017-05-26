package step09.ex3;

public class A {
  int a ;
  
  public A() {
//    int a = 20;
    //super는 첫 번째 문장이 되어야한다 안 그러면 오류
    super();
    
    System.out.println("A()");
  }
} 
