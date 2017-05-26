
package step17;

public class Test09 {
  
//  static class InvalidValueScopeException extends Exception {
//    public InvalidValueScopeException(String s) {
//      super(s);
//    }
//  }
  
  public static void main(String[] args) {
    
    if (args.length < 1) 
      throw new IllegalArgumentException("애플리케이션 아규먼트가 없습니다");

    int age = Integer.parseInt(args[0]);

    if (age < 1) 
      throw new IllegalArgumentException("나이가 유효하지 않슴다");

    System.out.println(age);


  }
}


