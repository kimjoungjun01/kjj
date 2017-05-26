//일반모드(Exception 계열 예외)와 스텔스모드(Error와 RuntiomeExceprion 계열 예외) 공식용어가 아님
package step17;

public class Test12 {
  

  static void m1(int v) {
    m2(v);
  }

  static void m2(int v) {
    try {
      m3(v);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  static void m3(int v) {
    m4(v);
  }
  static void m4(int v) {
    if (v < 0)
      throw new RuntimeException("음수는 허용하지 않습니다");
    System.out.println(v);
  }
  
  public static void main(String[] args) {
    try {
      if (args.length < 1) {
        System.out.println("[사용법] java -cp bin step17.Test11 숫자");
        return ;
      }
      m1(Integer.parseInt(args[0]));
      
    } catch (NumberFormatException e) {
      System.out.println("프로그램 아규먼트는 숫자여야 합니다.");
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("안녕");
  }
}


