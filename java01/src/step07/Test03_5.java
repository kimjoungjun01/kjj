package step07;

public class Test03_5 {
  
  static class Student {
    int age = 20;
    
    //까먹지 말 것. 생성자는 클래스명과 같아야한다.
    //이렇게 파라미터가 없는 생성자를 "기본생성자 (default constructor)"이라 부른다
    Student() {
      //인스턴스 생성 후 자동으로 호출된다.
      //여러개를 생성할 수 있지만 그 중에서 한 개만 호출되며, 
      //new 명령어 작성시 호출될 생성자를 지정해야한다.
      System.out.println("Student()...호출");
    }
    
    Student(int a) {
      System.out.println("Student(int)...호출");
    }
    
//    Student(int b) {
//      System.out.println("Student(int)...호출");
//    } 타입에 따라 생성자를 분류할 수 있는것이기 때문에 변수는 중요하지 않음.
//타입이 달라야 함 혹은 받는 파라미터의 갯수가 중요
    Student(int a, int b) {
      System.out.println("Student(int, int)...호출");
    }
    
    Student(String s, int a) {
      System.out.println("Student(String, int)...호출");
    }
  }
  
  public static void main(String[] args) {
    new Student();
    System.out.println("----------------------------");
    new Student(1582);
    System.out.println("----------------------------");
    new Student(1, 2);
    System.out.println("----------------------------");
    new Student("홍길동", 2);
  }

}
