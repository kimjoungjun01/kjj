package step15;
//enum 문법 적용전 
//상수 값 다루기
public class Test01 {
  public static void main(String[] args) {
    Student s = new Student();
    s.setName("홍길동");
    s.setAge(20);
    //다음과 같이 상수를 사용하는 것이 코드를 읽을 때 좋다
//    s.setSchoolLevel(Student.DOCTOR);
    
    //물론 어떤 값을 넣어야 하는지 알고 있다면 다음과 같이 직접 값을 넣어도 된다
    //다만 직접 값을 넣을 때의 문제는 잘못된 값을 지정할 수 있다는 점이다
    s.setSchoolLevel(5);
    
    System.out.println(s);
  }
}
