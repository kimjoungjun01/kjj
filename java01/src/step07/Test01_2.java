package step07;

public class Test01_2 {
  static class Student {
    static String name;
    static int age;
    static boolean working;
    
    static void m1() {}
  }
  public static void main(String[] args) {
    //클래스 로딩시점 확인하기
    //레퍼런스 변수를 만들때에는 클래스를 로딩하지 않는다
    Student s;
    
    //클래스변수를 사용할 때 클래스를 로딩한다.
    //System.out.println(Student.name);
    
    //클래스의 메서드를 호출할때 클래스를 로딩한다
    //Student.m1();
    
    //new 명령을 사용할때 클래스를 로딩한다
    //new Student();
    
  }

}
