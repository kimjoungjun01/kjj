package step07;

public class Test04_9 {
  
  static class Calculator {
    public static void m1() {
      m2();
    }
    public static void m2() {
      m3();
    }
    public static void m3() {
      System.out.println("m3()...");
    }
  }
  
  public static void main(String[] args) {
    Calculator.m1();
  }

}
