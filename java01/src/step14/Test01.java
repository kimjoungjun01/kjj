package step14;

public class Test01 {
  public static void main(String[] args) {
    Bucket b = new Bucket();
    
    String str = new String("Hello");
    System.out.println(str.length());
    
    b.setValue(str);
    
    //getvalue 는 리턴타입이 Object 다 Object 의 주소를 스트링에 담을수는 없다
    //하위 클래스는 상위클래스의 주소를 담을 수 없다
    //기본적으로 상위클래스는 하위클래스 보다 기능이(메소드가) 적기 떄문에 하위클래스에서
    //상위클래스의 없는 기능을 사용할 수 있기 떄문에 미연에 방지하는것
//    String str2 = b.getValue();
    //이럴때 형변환이 필요하다
    String str2 = (String)b.getValue();
    System.out.println(str2.length());
    //그런데 이런 형변환은 번거롭다 값을 꺼낼 때 만다 형변환을 해야 하기 때문
    
  }
}
