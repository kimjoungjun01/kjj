package step10.ex2;
//다형적 변수의 응용
//Member Student Manager Teacher FreeStudent객체를 담을수있는 배열을 만들어라!
public class Test06 {
  
  public static void main(String[] args) {
    
    Member m = new Member();
    
    m.name = "홍길동";
    m.id = "hong";
    m.password = "1111";
    m.email = "hong@test.com";
    m.tel = "1111-1111";
    //이거 컴파일 에러
//    m.schoolName = "비트대학교";
//    m.grade = 4;
//    m.bank = "비트은행";
//    m.working = true;
    
    FreeStudent s = (FreeStudent)m;
    s.schoolname = "비트대학교";
    s.grade = 4;
    s.bank = "비트은행";
    s.working = true;
    
    System.out.println(s.name);
    System.out.println(s.id);
    System.out.println(s.password);
    System.out.println(s.email);
    System.out.println(s.tel);
    System.out.println(s.schoolname);
    System.out.println(s.grade);
    System.out.println(s.bank);
    System.out.println(s.working);
  } 
   
}