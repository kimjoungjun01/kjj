package step10.ex1;
//수퍼클래스의 메서드를 재정의 하는 방법
//오버 라이딩
//서브클래스의 조건에 맞게 수퍼클래스의 메서드를 재정의 하는 것 
public class Test02 {

  public static void main(String[] args) {
    BitStudent s = new BitStudent();
    s.name = "홍길동";
    s.age = 20;
    s.school = "비트대학교";
    s.print();
    
  }

}
