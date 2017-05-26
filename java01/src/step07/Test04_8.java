package step07;
//풀
public class Test04_8 {
  
  static class Calculator {
    static int result;
    
    //메서드도 인스턴스와 스태틱 메서드로 구분
    public void plus(int value) {
      this.result += value;
    }
    //this 는 있지만 this 안에 인스턴스 변수가 저장되지는 않는다
    //애초에 위에서는 클래스 변수이다
    //this 를 써도 자동으로 클래스 변수를 찾긴하기에 오류는 아닌데, 다만 다른사람이 코드를 봤을때
    //this 안에 인스턴스 변수가 있다고 착각할 여지가 있다
    public void minus(int value) {
      this.result -= value;
    }
    
  }
  
  public static void main(String[] args) {
    Calculator c = new Calculator();//인스턴스를 생성하고,클래스 변수만 있는게 아니다.
                                    //인스턴스 변수가 없는게 아니다.
                                    //인스턴스 변수가 눈에는 안보이지만 사실상 존재하고 있다.상속의 개념
    c.plus(10);
    System.out.println(Calculator.result);
    
  }

}
