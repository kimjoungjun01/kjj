package step09.ex4;

public class Test01 {
  public static void main(String[] args) {
    
    //super 가 자동으로 붙고, 수퍼클래스의 생성자를 호출할때
    //C의 기본생성자가 먼저 호출되고, 수퍼클래스가 호출되는것
    new C();
  }
}
