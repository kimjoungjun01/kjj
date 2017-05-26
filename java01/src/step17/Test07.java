//예외처리: 직접 만들어서 예외 던지기

package step17;

public class Test07 {
  static class InvalidValueScoreException extends IllegalArgumentException {
    //수퍼클래스의 메서드를 재정의 할때 쓰는 super 와 다른 의미다
    //기능을 추가하려고 super 를 쓴게 아니라 이름을 분류하고자 쓴 것
    //이 생성자 이전의 생성자()를 실행
    public InvalidValueScoreException() {
      super();
    }

    public InvalidValueScoreException(String message, Throwable cause) {
      super(message, cause);
    }

    public InvalidValueScoreException(String s) {
      super(s);
    }

    public InvalidValueScoreException(Throwable cause) {
      super(cause);
    }
    

  }
  public static void main(String[] args) {
    try {
      if (args.length < 1) 
        throw new IllegalArgumentException("애플리케이션 아규먼트가 없습니다");

      int age = Integer.parseInt(args[0]);

      if (age < 1) 
        throw new InvalidValueScoreException("나이가 유효하지 않슴다");
      
      System.out.println(age);


    } catch (Throwable ex) {
      //보통 이걸 쓴다
      //파일의 위치가 보이기도 하고, 메세지 또한 같이 보이기때문
      ex.printStackTrace();
    }
  }
}


