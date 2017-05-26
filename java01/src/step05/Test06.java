package step05;

public class Test06 {
  
  static class Student {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }
  public static Student getStudent(int studentNo) {
    
    Student s = new Student();
    s.name = "홍길동";
    s.kor = 100;
    s.eng = 90;
    s.math = 80; 
    s.sum = 100 + 90 + 80;
    s.aver = (100 + 90 + 80) / 3f;
    return s;
  }
  
  public static void main(String[] args) {
    Student s2 = getStudent(100);
    
    System.out.println(s2.name);
    System.out.println(s2.kor);
    System.out.println(s2.eng);
    System.out.println(s2.math);
    System.out.println(s2.sum);
    System.out.println(s2.aver);
  }
}
