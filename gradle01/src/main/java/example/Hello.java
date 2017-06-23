package example;

public class Hello {
  public static void main(String[] args) {
    System.out.println("Hello");
    
    String level = "mgr";
    switch (level) {
    case "mgr": System.out.println("관리자요"); break;
    case "user": System.out.println("일반이요"); break;
    default: System.out.println("없음");
    
    }
  }
 
}