package step04;

public class Test03_9 {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    // for (변수선언 : 배열) 
    for (int value : arr) {
      System.out.print(value + ",");
    }
    
    System.out.println();
    System.out.println("---------------------");
    
    // for(변수선언 : 컬렉션 타입)
    java.util.ArrayList<Integer> arr2 = new java.util.ArrayList<>();
    arr2.add(10);
    arr2.add(20);
    arr2.add(30);
    
    for (int value : arr2) {
      System.out.print(value + ",");
    }
    
    
  }
}
