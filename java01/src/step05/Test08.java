package step05;

public class Test08 {

  public static int[] m1(int a) {
    int[] arr = m2(a + 1);
    arr[2] = a;
    return arr;
  }
  
  public static int[] m2(int a) {
    int[] arr = m3(a + 1);
    arr[1] = a;
    return arr;
  }
  
  public static int[] m3(int a) {
    int[] arr = new int[3];//메서드 호출이 끝나도 객체인 new int(배열)는 힙이라는 영역에 보관되기때문에 데이타는 남아있다.
    //arr 은 로컬변수다
    arr[0] = a;
    return arr;
  }
 
  public static void main(String[] args) {
    int[] arr = m1(100);
    for (int i = 0; i < arr.length; i++) {
      System.out.printf("%d=%d\n", i, arr[i]);
    }
  }
  
}
