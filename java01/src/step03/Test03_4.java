package step03;

public class Test03_4 {
  public static void m1(int value) {
    System.out.println(value);
  }
  
  public static void main(String[] args) {
    int a = 0b1100_1010;
    int b = 0b0101_0101;
    
    int r = a & b; //다르면 0 
    String str = Integer.toBinaryString(r);
    System.out.println(str);
    
    r = a | b; //다르면 1
    System.out.println(Integer.toBinaryString(r));
    
    r = a ^ b;//다르면 1 같으면 0
    System.out.println(Integer.toBinaryString(r));
    
    r = ~a; //반전
    System.out.println(Integer.toBinaryString(r));

  }

}
