package step10.ex1;

public class BitStudent extends Student {
  String school;
  void print() {
//    System.out.printf("이름: %s\n", this.name);
//    System.out.printf("나이: %d\n", age);
//    System.out.printf("학교: %s\n", school);
    //복붙은 ㄴㄴ
    
    super.print();
    //주의! 이 super 은 수퍼클래스(Student)를 의미하는게 아니다
    //이 클래스에서 재정의하기 전의 print() 를 실행하라는 의미
    System.out.printf("학교: %s\n", school);
  }
}
