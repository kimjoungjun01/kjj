package step07;

public class Test03_6 {
  
  static class Student {
    int age = 20;
    
    Student(int a) {
      System.out.println("Student(int)...호출");
    }
    
    Student(int a, int b) {
      System.out.println("Student(int, int)...호출");
    }
    
    Student(String s, int a) {
      System.out.println("Student(String, int)...호출");
    }
  }
  
  public static void main(String[] args) {
//    new Student();
    System.out.println("----------------------------");
    new Student(1582);
    System.out.println("----------------------------");
    new Student(1, 2);
    System.out.println("----------------------------");
    new Student("홍길동", 2);
  }

}
