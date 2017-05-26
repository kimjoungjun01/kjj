//예외처리: throw 명령
//코드를 실행하는 쪽에 예외정보를 전달하는 명령어다
package step17;

public class Test04 {

  public static void main(String[] args) {
    try {
      if (args.length < 1) 
        throw new Throwable("애플리케이션 아규먼트가 없습니다");
      
      int age = Integer.parseInt(args[0]);
      
      if (age < 1) 
        throw new Throwable("나이가 유효하지 않슴다");
        
      System.out.println(age);

      
    } catch (Throwable ex) {
      //Throwable 타입이면 값을 받는데
      //여기서 Integer의 parseInt 메소드가 예외상황일때
      //NumberFormatException타입의 예외를 던지는데 이 타입은
      //Throwable의 자손클래스이기 때문에 여기서도 값을 받는다.
      System.out.println(ex.getMessage());
    }
  }
}


