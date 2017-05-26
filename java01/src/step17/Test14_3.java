package step17;

public class Test14_3 {
  static class A {
    public void close() throws Exception{
      System.out.println("A.close()");
    }
  }
  static class B implements AutoCloseable{
    public void close() throws Exception{
      System.out.println("B.close()");
    }
  }
  
  public static void main(String[] args) {
    int age = 19;
    
    try (B obj2 = new B()) {
      if (age < 19) {
        throw new Exception("미성년입니다");
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } 
    System.out.println("안녕");
  }
}


