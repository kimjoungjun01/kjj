package step17;

public class Test13 {
  
  public static void main(String[] args) {
    try {
      if (args.length < 1) {
        System.out.println("사용법 : 뒤에 숫자 붙이시죠");
        return;
      }
      
      System.out.println(Integer.parseInt(args[0]));
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {//파이널리는 무조건 실행된다
      //return을 하든 에러를 안띄우든 띄우든
      System.out.println("오호라~");
    }
    System.out.println("안녕");
  }
}


