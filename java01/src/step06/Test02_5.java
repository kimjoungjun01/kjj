package step06;

import step06.Test01_2.Student;

public class Test02_5 {
  
  public static void main(String[] args) {
    //홍길동,임꺽정,유관순 회원의 성적 정보를 따로 보관할 수 없는 치명적 문제가 있다.
    //그 이유는 static 때문이며, static 이 붙지않는 변수를 인스턴스 변수라 한다.
    //static변수는 그 내부에서 변수의 값을 공유하기 때문이다.
    Member.init("홍길동", 100, 100, 100);
    Member.init("임꺽정", 90, 90, 90);
    Member.init("유관순", 80, 80, 80);
    
    Member.compute();
    Member.print();
  }

}
