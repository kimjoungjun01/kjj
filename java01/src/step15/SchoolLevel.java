package step15;
//enum 문법 상수를 전문적으로 정의하는 문법
//값을 지정하지 않고 상수의 이름만 지정한다.
public enum SchoolLevel {
  
  //다음 각각의 상수는 SchoolLevel의 객체이다
  //즉 "HIGHT_SCHOOL"의 타입이 "SchoolLevel"라는 뜻이다
  //각 상수 객체는 상수명과 인덱스 값을 내부 변수에 보관한다.  
  
  HIGH_SCHOOL, //SchoolLevel HIGHT_SCHOOL = new SchoolLevel();
  BACHELOR,    //SchoolLevel BACHELOR = new SchoolLevel(); 
  MASTER,      //SchoolLevel MASTER = new SchoolLevel(); 
  DOCTOR       //SchoolLevel DOCTOR = new SchoolLevel();
}
