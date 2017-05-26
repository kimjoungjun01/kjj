package step07;

public class Test04_6 {
  
  static class Calculator {
    static int result;
    
    //메서드도 인스턴스와 스태틱 메서드로 구분
    public void plus(int value) {
      Calculator.result += value;
    }
    //this 는 있지만 this 안에 인스턴스 변수가 저장되지는 않는다
    //애초에 위에는 클래스변수를 선언했다.
    public void minus(int value) {
      Calculator.result -= value;
    }
    
  }
  
  public static void main(String[] args) {
    Calculator c = new Calculator();//인스턴스를 생성하고, 인스턴스 변수가 없는게 아니다.
                                    //인스턴스 변수가 눈에는 안보이지만 있다.상속의 개념
    c.plus(10);
    System.out.println(Calculator.result);
    
  }

}
