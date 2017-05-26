package step12.ex3;

public class B {
  int a;
  final int b = 20;
  
  public B() {
    a = 10;
    b = 20;
    //이미 변수 선언부에 값을 초기화시켰기때문에 생성자에서 또 값을 저장할 수 없다.
  }
  
  public void m() {
    b = 30;
    //final 변수는 딱 한 번만 값을 저장할 수 있다.A.java
  }
}
