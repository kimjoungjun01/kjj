package step07;

public class Test01_3 {
  
  static class Student {
    static String name;
    static int age;
    static boolean working;
    
  }
  
  public static void main(String[] args) {
    System.out.println(Student.name);
    System.out.println(Student.age);
    System.out.println(Student.working);
    
    Student.name = "홍길동";
    Student.age = 20;
    Student.working = true;
    
    System.out.println(Student.name);
    System.out.println(Student.age);
    System.out.println(Student.working);
    
    //주의! 로컬변수는 자동으로 0값으로 초기화 되지 않는다 
    //클래스 변수와 인스턴스 변수만이 자동으로 0으로 초기화된다.
//    int a;
//    System.out.println(a);
  }

}
