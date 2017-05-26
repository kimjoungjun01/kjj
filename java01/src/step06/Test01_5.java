package step06;

public class Test01_5 {
  //인스턴스 메서드 호출방법
  public static void main(String[] args) {
    //같은 패키지안에 분리시켜 놓은 클래스를 사용할 수 있다!
    //인스턴스 메서드를 호출할 때에는 반드시 인스턴스 주소를 앞에 놓아야 한다.
    //인스턴스 메서드를 "인스턴스의 연산자(오퍼레이터)"라고도 한다.
    Student2 s1 = new Student2();
    s1.init("홍길동", 100, 100, 100);
    s1.compute();
    
    Student2 s2 = new Student2();
    s2.init("임꺽정", 90, 90, 90);
    s2.compute();
    
    Student2 s3 = new Student2();
    s3.init("유관순", 80, 80, 80);
    s3.compute();
    
    s1.print();
    s2.print();
    s3.print();
  }

}
