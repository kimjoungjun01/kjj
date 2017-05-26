package step14;

import java.util.Date;

//제네릭 문법을 사용한다면
//값을 꺼낼 때 마다 형변환할 필요가 없다
public class Test03 {
  public static void main(String[] args) {
//  이번엔 타입을 지정해보자
    Bucket2<String> b = new Bucket2<>();
    //new 다음에는 타입을 생략가능
    //다만 이 문법은 버전마다 다르다
    //Java7 이상부터 가능
    
    b.setValue(new String("Hello"));
    String str = b.getValue(); //형변환이 필요 없다
    System.out.println(str);
    //클래스를 만들 때 다룰 값의 타입을 String으로 제한했기 떄문에,
    //다음과 같이 다른 타입의 값은 저장할 수 없다
    
//    b.setValue(new java.util.Date());
//    b.setValue(new Integer(0));
    
    
  }
}
