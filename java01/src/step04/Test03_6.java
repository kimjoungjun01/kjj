package step04;

public class Test03_6 {

  public static void main(String[] args) {
    int i = 2;
    int j = 1;
    int r = 0;
    
    loop1 : // 중괄호로 묶지 않으면 첫 번재 문장만 라벨에 소속된다.
    while (i <= 9) {
      j = 1;
      while (j <= 9) {
        System.out.printf("%d * %d = %d\n", i, j, (i * j));
        if (i == 5 && j ==5)
          break loop1; //해당라벨의 문장을 탈출한다. 
        j++;
      }
      System.out.println("--------------------------------------");
      i++;
    }
  }
}
