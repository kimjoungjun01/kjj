package step14;

import java.util.Date;

//제네릭 문법을 사용한다면
//값을 꺼낼 때 마다 형변환할 필요가 없다
public class Test02 {
  public static void main(String[] args) {
    //제네릭 클래스를 사용할 때 타입을 지정하지 않으면 기본이 Object다
    Bucket2 b = new Bucket2();
    
    //모든 타입을 넣을수 있다
    b.setValue(new String("Hello"));
    //단 예전처럼 값을 꺼낼때 마다 형변환을 해야한다
    String str = (String)b.getValue();
    
    b.setValue(new java.util.Date());
    Date date = (Date)b.getValue();
    
    b.setValue(new Integer(0));
    Integer i = (Integer)b.getValue();
    
    
  }
}
