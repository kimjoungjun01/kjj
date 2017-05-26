package step10.ex2;
//다형적 변수의 응용
//Member Student Manager Teacher FreeStudent객체를 담을수있는 배열을 만들어라!
public class Test04 {
  public static void main(String[] args) {
    
    checkReference(new Member());
    checkReference(new Student());
    checkReference(new Manager());
    checkReference(new Teacher());
    checkReference(new FreeStudent());
  }
  
  static void checkReference(Object obj) {
    if (obj instanceof Member) System.out.println("멤버의 인스턴스이다");
    if (obj instanceof Student) System.out.println("스튜던트의 인스턴스이다");
    if (obj instanceof Manager) System.out.println("매니저의 인스턴스이다");
    if (obj instanceof Teacher) System.out.println("티쳐의 인스턴스이다");
    if (obj instanceof FreeStudent) System.out.println("프리스튜던트의 인스턴스이다");
    System.out.println("----------------------------");
  }
}
