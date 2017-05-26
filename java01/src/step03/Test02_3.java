package step03;

public class Test02_3 {

  public static void main(String[] args) {
    int i = 3;
    int r = ++i + ++i * --i;
    
    System.out.printf("%d, %d\n", i, r);
    
    i = 3;
    r = i++ + ++i * i--;
    System.out.printf("%d, %d\n", i, r);
    
  }

}
