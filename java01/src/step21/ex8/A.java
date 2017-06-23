package step21.ex8;

public interface A {

  public abstract void m1();
  
  public void m2();
  //abstract 생략해도 내부적으로 간주
  
  void m3();
  
//  void m4() {};
  
  public static final int v1 = 200;
  
  static final int v2 = 200;
  
  final int v3 = 200;
  
  int v4 = 200;
  
//int v5; final 이라 값을 줘야한다
}
