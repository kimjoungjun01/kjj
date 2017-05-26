package step07;

public class Test04_3 {
  
  static class Calculator {
    int result;
    
    Calculator(int value) {
      Calculator.this.result = value;
    }
    //메서드도 인스턴스와 스태틱 메서드로 구분
    public void plus(int value) {
      Calculator.this.result += value;
    }
    
    public void minus(int value) {
      Calculator.this.result -= value;
    }
    
  }
  
  public static void main(String[] args) {
    Calculator c1 = new Calculator(10);
    c1.plus(10);
    System.out.println(c1.result);
    
  }

}
