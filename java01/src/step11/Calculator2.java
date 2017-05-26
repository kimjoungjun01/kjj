package step11;

public class Calculator2 {
  private int result;
  
  void plus(int value) {
    this.result += value;
  }
  
  public void plus2(int v1, int v2) {
    result += v1 + v2;
  }
  
  public void plus(int[] values) {
   for (int v : values) {
     result += v;
   }
  }
  
  public void minus(int value) {
    this.result -= value;
  }
  
  public int getResult() {
    return result;
  }
}