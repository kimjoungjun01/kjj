//예외처리: catch

//throw 가 전달한 예외 객체를 받는 명령
//catch (예외 객체를 받을 변수)
//예외객체의 타입별로 구분하여 받을 수 있다.

package step17;

public class Test06 {

  public static void main(String[] args) {
    try {
      if (args.length < 1) 
        throw new Throwable("애플리케이션 아규먼트가 없습니다");
      
      int age = Integer.parseInt(args[0]);
      
      if (age < 1) 
        throw new Exception("나이가 유효하지 않슴다");
        
      System.out.println(age);
      
      
      //catch 에서 중요한건 순서다
      //자식 클래스(타입)부터 -> 부모 클래스(타입) 순으로 가야한다
    } catch (NumberFormatException e) {
      //이게 실행되는 이유는 Integer의 parseInt 메소드가 예외상황일때
      //NumberFormatException타입의 예외를 던지기떄문이다
      System.out.println("애플리케이션의 아규먼트가 숫자가아닌데요");
    } catch (Exception ex) {
      System.out.println("나이값이 유효하지 않습니다.");
      
    } catch (Throwable ex) {
      System.out.println(ex.getMessage()); //꼭 메세지를 받지않아도 실행됨
      System.out.println("이거도 되나? 되네");
    }
  }
}


