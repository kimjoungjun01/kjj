package step07;

public class Test04_10 {
  
  static class Calculator {
    int value;
    
    Calculator(int value) {
      this.value = value;
    }
    
    public void m1() {
      m2();
    }
    public void m2() {
      Calculator.this.m3();
    }
    public void m3() {
      System.out.println(value);
    }
  }
  
  public static void main(String[] args) {
    Calculator c1 = new Calculator(10);
    Calculator c2 = new Calculator(20);
    Calculator c3 = new Calculator(30);
    c1.m1();
    c2.m1();
    c3.m1();
  }

}
