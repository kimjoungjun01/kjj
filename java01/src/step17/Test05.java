//예외처리: catch

//throw 가 전달한 예외 객체를 받는 명령
//catch (예외 객체를 받을 변수)
//예외객체의 타입별로 구분하여 받을 수 있다.

package step17;

public class Test05 {

  public static void main(String[] args) {
    try {
      if (args.length < 1) 
        throw new Throwable("애플리케이션 아규먼트가 없습니다");
      
      int age = Integer.parseInt(args[0]);
      
      if (age < 1) 
        //메세지를 넘기지 않아도 되네요
//        throw new Throwable();
        throw new Throwable("나이가 유효하지 않아여");
        
      System.out.println(age);
    } catch (NumberFormatException e) {
      System.out.println("애플리케이션의 아규먼트가 숫자가아닌데요");
    } catch (Throwable ex) {
      System.out.println(ex.getMessage()); //꼭 메세지를 받지않아도 실행됨
      System.out.println("이거도 되나? 되네");
    }
  }
}


