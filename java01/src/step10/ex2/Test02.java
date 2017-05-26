package step10.ex2;
//수퍼클래스의 인스턴스를 저장할 수 없는이 유
public class Test02 {
  public static void main(String[] args) {
//    Member m = new Member(); ok
//    Member m = new Student(); ok
    Member m = new FreeStudent(); //ok
    m.name = "홍길동";
    m.id ="hong";
    m.password ="1111";
    m.tel = "1111-1111";
    m.email = "hong@test.com";
    
    Student s = new Student(); //ok
//    Student s = new FreeStudent(); ok
//    Student s = new Member(); no!
    
    s.name = "홍길동";
    s.id ="hong";
    s.password ="1111";
    s.tel = "1111-1111";
    s.email = "hong@test.com";
    s.schoolname = "비트대학교";
    s.grade = 4;
    
    Student s2 = new FreeStudent();
    FreeStudent f1 = new FreeStudent();
    //"다형적 변수(polymorphic variable)" - 다형성(polymorphism)
    //한 개의 레퍼런스 변수(Member, Student 등)가 다양한 객체의 주소를 담을 수 있다
    //물론 서브 클래스의 객체 주소만 담을 수 있다.
  }
}
