package step07;

public class Test03_4 {
  
  static class Student {
    int age = 20;
    
    //이렇게 파라미터가 없는 생성자를 "기본생성자 (default constructor)"이라 부른다
    //클래스를 작성할 때 생성자를 만들지 않으면, 컴파일러가 자동으로 기본 생성자를 만든다.
    //즉, 모든 클래스는 생성자가 하나씩 반드시 있다.
    Student() {
      //인스턴스 생성 후 자동으로 호출된다.
      //여러개를 생성할 수 있지만 그 중에서 한 개만 호출되며, 
      //new 명령어 작성시 호출될 생성자를 지정해야한다.
      System.out.println("Student()...호출");
    }
    
  }
  
  static class Student2 {
    int age = 20;
  }
  
  public static void main(String[] args) {
//    new Student; 생성자 호출 안하면 컴파일 에러
    
    //이거 괄호가 생성자 호출하는거
    new Student();
    System.out.println("----------------------------");
    new Student2();
    
    //주어진 값을 받을 수 있는 생성자가 존재하지 않을 때 컴파일 오류 발생
//    new Student(20);
  }

}
