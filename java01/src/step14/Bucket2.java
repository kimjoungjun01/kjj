package step14;

// 클래스 선언부에 이 클래스가 다룰 타입(클래스 또는 인터페이스)이 무엇인지
// 타입 정보를 받을 변수를 선언한다
public class Bucket2<T> {
  T value;
  
  public void setValue(T value) {
    this.value = value;
    System.out.println(value);
  }
  
  public T getValue() {
    return value;
  }
}
