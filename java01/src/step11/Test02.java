package step11;

public class Test02 {
  public static void main(String[] args) {
    Calculator2 c = new Calculator2();
    c.plus(10);
    c.plus(7);
    c.minus(3);
    
//    c.result = 100;
    //위 코드처럼 result값을 직접 변경할 수 있기때문에 잘못된 결과를 출력할 수 있다
    //해결책
    //result를 외부에서 직접 접근할 수 없게 만들기
    System.out.println(c.getResult());
  }
}
