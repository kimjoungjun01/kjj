package step13;


public class Test03_1 {
  
  
  int a;
  
  class A {
    int a;
  }
  
  public void test() {
    //인스턴스 블록에서 스태틱과 인스턴스 멤버 사용 가능하다
    a = 20;
    A obj = new A();
    obj.a = 200;
  }

  public static void main(String[] args) {
    Test03_1 obj = new Test03_1();
    obj.test();
    //스태틱 매서드는 인스턴스를 만들지 않기 떄문에 항상 new 명령어를 사용하여 인스턴스를 생성한뒤
    //호출해야한다
    obj.a = 10;
    
//    A obj2 = new A(); 컴파일오류// 클래스앞에 스태틱이 없으므로 인스턴스 멤버라 생각하고 사용할 것 
    A obj3 = obj.new A(); //이렇게 사용 이런경우가 거의 없지만 있을수도있으니 알아만 둘것
    obj3.a = 20;
  }
}
