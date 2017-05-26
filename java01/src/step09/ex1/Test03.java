package step09.ex1;
//상속 문법을 사용하기 전 3
//우리는 AdvancedCalculator에 나누기 기능을 추가시키고 싶다.
//해결 방법
// 원본 AdvancedCalculator.java 소스파일에 
// 나누기를 처리하는 메서드를 추가하는 방법
//방법 2
// 원본 복사하여 MasterCalculator.java를 만든다
// 그리고 그 소스 파일에 나누기 기능을 추가한다.
// 왜? 가능한 원본을 손대지 않기 위해
public class Test03 {
  public static void main(String[] args) {
    MasterCalculator calc = new MasterCalculator();
    calc.plus(100);
    calc.plus(20);
    calc.minus(30);
    calc.multiple(2);
    calc.divide(3);
    System.out.println(calc.result);
  }

}
