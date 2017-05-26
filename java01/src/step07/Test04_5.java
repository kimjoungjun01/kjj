package step07;

public class Test04_5 {
  
  static class Calculator {
    static int result;
    
    //메서드도 인스턴스와 스태틱 메서드로 구분
    public static void plus(int value) {
      result += value;
    }
    
    public static void minus(int value) {
      result -= value;
    }
    
  }
  
  public static void main(String[] args) {
    Calculator.plus(10);
    System.out.println(Calculator.result);
    
  }

}
