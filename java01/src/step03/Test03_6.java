package step03;

public class Test03_6 {
  public static void main(String[] args) {
    int a = 0b0000_1011;
    
    System.out.println(a);
    System.out.println(a >> 1);// a 나누기 2^1 과 같다 0000_0101
    System.out.println(a >> 2);// a 나누기 2^2 과 같다
    System.out.println(a >> 3);// a 나누기 2^3 과 같다
    
    //>>> 연산자는 빈자리를 0으로채움
    System.out.println(-10 >> 2);//음수
    System.out.println(-10 >>> 2);//양수
    
    //<<< 연산자는 없다!
    System.out.println(a << 1);// a 곱 2^1 과 같다
    System.out.println(a << 2);// a 곱 2^2 과 같다
    System.out.println(a << 3);// a 곱 2^3 과 같다
    System.out.println(-10 << 2);
  }

}
