package step05;

public class Test03 {
  
  
  public static int[] getScore(int studentNo) {
    int[] scores = {100, 90, 100};
    return scores;
  }
  
  public static void main(String[] args) {
   //객체(배열)는 힙이라는 영역에서 유지되기때문에 다른 메서드에서 사용가능하다!
   //
   int[] arr = getScore(100);
   for (int value : arr) {
     System.out.println(value);
   }
   
  

  }
}
