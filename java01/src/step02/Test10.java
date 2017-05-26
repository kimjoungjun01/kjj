package step02;

public class Test10 {

  public static void main(String[] args) {
    byte[][] arr1 = new byte[][]{
      {10},
      {11, 21},
      {12, 22, 32},
      {13, 23, 33, 43}
    };
    
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr1[i].length; j++){            
        System.out.printf("%d ", arr1[i][j]);
      }
      System.out.println();      
    }

  }
}
