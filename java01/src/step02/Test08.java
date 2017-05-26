package step02;

public class Test08 {

  public static void main(String[] args) {
    byte[] arr1 = new byte[3];
    arr1[0] = 10; 
    arr1[1] = 20;
    arr1[2] = 30;
    System.out.printf("%d, %d, %d\n", arr1[0], arr1[1], arr1[2]);
    
    arr1 = new byte[]{40, 50, 60, 70, 80}; //arr1에 새로 배열의 주소를 저장한것이다 위의 arr1은 데이터가 덮어씌워진다
                                           //즉 프로그램이 종료될때 까지 위의 것은 사용할 수 없다
                                           //이렇게 주소를 잃어버려 사용할 수 없는 메모리를
                                           //프로그래밍 용어로 "Dangling Object"라고 부른다
                                           //자바에서는 쓰레기 "Garbage" 라 부른다
    //자바에서는 메모리를 효율적으로 관리하기 위해, 메모리가 부족할때마다
    //이런 쓰레기를 정리한다
    //이렇게 쓰레기를 정리해주는 프로그램을 "쓰레기 수집기(Garbage Collector)"라고 부른다.
    System.out.printf("%d, %d, %d, %d, %d\n", arr1[0], arr1[1], arr1[2], arr1[3], arr1[4]);
    
  
  }
}
