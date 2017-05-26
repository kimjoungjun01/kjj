package step13;

import java.lang.reflect.Method;

//기트
public class Test05_1 {

  public static void main(String[] args) throws Exception {
    //Object를 상속 받은 익명 클래스 만들기
    Object obj = new Object() {
      int value;
      
      //익명클래스는 클래스 이름이 없어서 생성자를 만들 수 없다
      //이 경우 인스턴스 변수를 초기화시키는 적절한 방법은
      //인스턴스 블록을 사용하는 방법이다
      {
       System.out.println("인스턴스 블록...");
       value = 100;
      }
      
      public void m1() {
        System.out.println("m1()...");
        System.out.println(value);
      }
    };
    
    Class clazz = obj.getClass();

    Method m = clazz.getMethod("m1");
    m.invoke(obj);
    
  }
}
