package step07;

public class Test03_2 {
  
  static class Student {
    static String name = "홍길동";
    int age = 20;
    static {
      System.out.println("static {...}");
    }
    
    {
      System.out.println(age);
      System.out.println("{인스턴스 블록 실행}");
      this.age = 30;
    }
    
    {
      System.out.println("{인스턴스 블록 실행 2}");
    }
  }
  
  public static void main(String[] args) {
    //실험 할 것
    new Student();
    System.out.println("----------------------------");
    new Student();
  }

}
