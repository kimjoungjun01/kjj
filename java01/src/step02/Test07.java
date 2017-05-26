package step02;

public class Test07 {

  public static void main(String[] args) {
    byte[] arr1 = new byte[3];
    arr1[0] = 10; 
    arr1[1] = 20;
    arr1[2] = 30;
    System.out.printf("%d, %d, %d\n", arr1[0], arr1[1], arr1[2]);
    
    byte[] arr2 = new byte[]{40, 50, 60};
    System.out.printf("%d, %d, %d\n", arr2[0],arr2[1],arr2[2]);
    
    byte[] arr3 = {70, 80, 90}; //앞에 new byte[]가 생략된것
    System.out.printf("%d, %d, %d\n", arr3[0],arr3[1],arr3[2]);
    
    byte[] arr4;
    arr4 = new byte[]{100, 110, 120};
    System.out.printf("%d, %d, %d\n", arr4[0],arr4[1],arr4[2]);
    
    byte[] arr5;
//    arr5 = {70, 80, 90}; 요건 컴파일 오류입니당
    
    //주의 자바에서는 중괄호가 객체를 의미하는게 아니라 배열을 의미한다
  }
}
