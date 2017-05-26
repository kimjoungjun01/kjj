package step04;

public class Test03_8 {

  public static void main(String[] args) {
    for (int i = 2; i <= 9; i++) {
      System.out.print(i + ",");
    }
    System.out.println();
    //주의 블록안에서 선언된 변수는 블록을 벗어날시 제거된다.
    System.out.println("----------------------");
    
    int i = 2;
    for (; i <= 9; i++) {
      System.out.print(i + ",");
    }
    System.out.println();
    System.out.println("----------------------");
    
    i = 2;
    for (; i <= 9;) {
      System.out.print(i + ",");
      i++;
    }
    System.out.println();
    System.out.println("----------------------");
    
    
    i = 2;
    for (;;) {
      System.out.print(i + ",");
      i++;
      if (i > 9)
        break;
    }
    System.out.println();
    System.out.println("----------------------");
    
  }
}
