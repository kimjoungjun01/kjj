package step03;

public class Test03_3 {
  public static void m1(int value) {
    System.out.println(value);
  }
  
  public static void main(String[] args) {
    String s = (5 % 2) == 0 ? "짝수" : "홀수";
    System.out.println(s);
  }

}
