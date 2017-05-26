package step07;

public class Test02_1 {
  
  static class Student {
    //요건 인스턴스 변수가 아닌 인스턴스 변수를 만들라는 일종의 명령이다!
    //즉 변수 선언!
    //이건 static 에서든 어디서든 다 같으므로 주의깊게 생각해볼 것!
    //new 명령어를 만났을때 실행된다!
    //static은 클래스가 로딩된후 자동으로 실행되므로 따로 인스턴스를 만들 필요가 없는것이다
    String name;
    int age;
    boolean working;
    
  }
  
  public static void main(String[] args) {
    Student s = new Student();
    Student s2 = new Student(); //일단 한번 클래스를 로딩하면 또다시 로딩하진않는다.
                                //이미 로딩한번하고, 같은 설계도를 다시 사용하는 것이기때문
    
    System.out.println(s.name);
    System.out.println(s.age);
    System.out.println(s.working);
    
    s.name = "홍길동";
    s.age = 20;
    s.working = true;
    
    System.out.println(s.name);
    System.out.println(s.age);
    System.out.println(s.working);
    
    //주의! 로컬변수는 자동으로 0값으로 초기화 되지 않는다 
    //클래스 변수와 인스턴스 변수만이 자동으로 0으로 초기화된다.
//    int a;
//    System.out.println(a);
  }

}
