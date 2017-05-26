package step15;

import step13.Constants.school;

//enum 문법 적용 후
//상수 값 다루기
public class Test02 {
  public static void main(String[] args) {
    Student2 s = new Student2();
    s.setName("홍길동");
    s.setAge(20);
    
    
    //임의의 숫자를 넣을 수 없으며
    //반드시 그 상수 타입의 값을 넣어야 한다
    s.setSchoolLevel(SchoolLevel.DOCTOR);
    
    
    
    System.out.println(s);
    
    
  }
}
