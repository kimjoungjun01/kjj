package step06;

import step06.Test01_2.Student;

public class Test02_4 {
  
  public static void main(String[] args) {

    Member.init("홍길동", 100, 100, 100);
    Member.init("임꺽정", 90, 90, 90);
    Member.init("유관순", 80, 80, 80);
    
    Member.compute();
    Member.print();
  }

}
