package step03;

public class Test01_2 {

  public static void main(String[] args) {
    byte b1 = 10;
    byte b2 = 20;
    byte b3 = 10 + 20;
    /*상수와 상수의 연산 결과는 상수
     *상수값을 변수에 저장할 때 저장 가능하다면 ok
     *  저장 불가시에는 컴파일 오류
     *  byte b33 = 10 + 118;  
     */
    
    
    /*변수와 변수의 연산 결과는 변수
    byte b4 = b1 + b2;
    byte b5 = b1 + 20;
    byte b6 = 10 + b2;
     *변수의 값에 따라 결과가 달라지기 때문에 그 결과는 변수일 수 밖에 없다
     *
     * 변수연산의 최소 단위는 int 이다
     * 그래서 위의 코드에서 계산 결과가 모두 int 가 된다
     *
     */
    
    int i1 = 10;
    long l1 = 20;
    
//    int i2 = i1+l1
    long l2 = l1 + i1;
    
    float f1 = 10.0f;
    
    
    
  }

}
