package step15;
//enum 문법3 
//상수를 정의할 떄 값을 지정할 수 있다
//주의! 각 상수 객체에 대해 생성자를 호풀한다면 맨 끝 상수에는 세미콜론을 붙여야 한다.
public enum SchoolLevel2 {
  //다음 각각의 상수는 SchoolLevel2의 객체이다
  //즉 "HIGHT_SCHOOL"의 타입이 "SchoolLevel2"라는 뜻이다
  //각 상수 객체는 상수명과 인덱스 값을 내부 변수에 보관한다.  
  
  HIGH_SCHOOL(1), //SchoolLevel2 HIGHT_SCHOOL = new SchoolLevel2();
  BACHELOR(2),    //SchoolLevel2 BACHELOR = new SchoolLevel2(); 
  MASTER(3),      //SchoolLevel2 MASTER = new SchoolLevel2(); 
  DOCTOR(4);       //SchoolLevel2 DOCTOR = new SchoolLevel2();
  
  

  //상수 객체이기 떄문에 생성자로부터 한 번 값을 받으면 바꿀 일이 없다
  //그래도 바꿀 일이 없다는 것을 명확히 하기 위해 보통 final 을 붙인다
  private final int value;
  
  //enum 객체에 값을 지정하고 싶다면
  //기본 생성자 대신 그 값을 받는 생성자를 선언해야 한다
  //주의!
  //enum 생성자는 외부에서 호출할 수 없다.
  //오직 내부에서만 사용되는 생성자이기 때문에
  //public 등 modifier(변경자)를 붙일 수 없다.
  SchoolLevel2(int value) {
    this.value = value;
  }
  
  //가능하면 인스턴스 변수에 직접 접근하는 것을 막아라
  //메서드를 통해 값을 꺼내도록 하라
  
  public int value() {
    return this.value;
  }
}
