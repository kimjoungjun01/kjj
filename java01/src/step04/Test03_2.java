package step04;

public class Test03_2 {

  public static void main(String[] args) {
    int i = 0;
    int r = 0;
    
    while (i < 10) {
      if (i ==5)
        break;
      r += ++i;
    }
    
    System.out.printf("%d, %d\n", i, r);
  }
}
