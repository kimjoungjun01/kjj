package step06;

public class Test01_4 {
  //클래스 메서드 호출 방법
  //클래스 명을 앞에 놓아야함
  public static void main(String[] args) {
    //같은 패키지안에 분리시켜 놓은 클래스를 사용할 수 있다!
    Student s1 = new Student();
    Student.init(s1, "홍길동", 100, 100, 100);
    Student.compute(s1);
    
    Student s2 = new Student();
    Student.init(s2, "임꺽정", 90, 90, 90);
    Student.compute(s2);
    
    Student s3 = new Student();
    Student.init(s3, "유관순", 80, 80, 80);
    Student.compute(s3);
    
    Student.print(s1);
    Student.print(s2);
    Student.print(s3);
  }

}
