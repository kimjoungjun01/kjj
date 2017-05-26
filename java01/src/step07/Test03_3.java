package step07;

public class Test03_3 {
  
  static class Student {
    static String name = "홍길동";
    int age = 20;
    static {
      System.out.println("static {...}");
    }
    
    {
      System.out.println("{인스턴스 블록 실행}");
    }
    
    
    //근데 public 붙이고 안붙이고 의미가 다른건가?
    //이렇게 파라미터가 없는 생성자를 "기본생성자 (default constructor)"이라 부른다
    Student() {
      //인스턴스 생성 후 자동으로 호출된다.
      //여러개를 생성할 수 있지만 그 중에서 한 개만 호출되며, 
      //new 명령어 작성시 호출될 생성자를 지정해야한다.
      System.out.println("Student()...호출");
    }
  }
  
  public static void main(String[] args) {
    new Student();
    System.out.println("----------------------------");
    new Student();
  }

}
