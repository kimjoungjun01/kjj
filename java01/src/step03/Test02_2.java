package step03;

public class Test02_2 {

  public static void main(String[] args) {
    int x = 0;
    int i = 10;
    
    x = ++i;

    System.out.printf("%d, %d\n", i, x);
    
    i = 10;
    x = i++ + i-- + i--;
    System.out.printf("%d, %d\n", i, x);

  }

}
