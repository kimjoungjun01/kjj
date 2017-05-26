package step07;

public class Test02_2 {
  
  static class Student {
    //인스턴스 변수는 new 를 만날때마다 변수가 생성된다.
    //즉 100개의 new 를 만나면 100개의 메모리가 만들어진다는 것이다.
    //아래와 같이 조회와 같은 의미?만을 가질 경우에는(공유해야 하는 값일 경우에는) static 을 쓰도록 한다.
    //static은 값을 공유하기때문에 메모리는 한번만 생성된다 
    //step06 - Test02_5를 참조하라
    static int guest = 0;
    static int member = 1;
    static int admin = 2;
    
    String name;
    int age;
    boolean working;
    int level;
    
  }
  
  public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student();
    
    s1.name = "홍길동";
    s1.age = 20;
    s1.working = true;
    s1.level = Student.guest;
    
    s2.name = "임꺽정";
    s2.age = 30;
    s2.working = true;
    s2.level = Student.admin;
    
    
    System.out.println(s1.name);
    System.out.println(s1.age);
    System.out.println(s1.working);
    System.out.println(s1.level);
    
    System.out.println(s2.name);
    System.out.println(s2.age);
    System.out.println(s2.working);
    System.out.println(s2.level);
  }

}
