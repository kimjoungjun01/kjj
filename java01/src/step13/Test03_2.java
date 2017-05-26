package step13;


public class Test03_2 {
  int v1;
  int v2;
  
  class A {
    int v1;
    public void m1() {
      this.v1 = 100;
      System.out.printf("A.v1 = %d", this.v1);
      System.out.printf("\nTest03_2.v1 = %d", Test03_2.this.v1);
      System.out.printf("\nTest03_2.v2 = %d", v2);
    }
  }
  
  public void test() {
    A p = new A();
    p.m1();
    System.out.printf("v1=%d, v2=%d\n", this.v1, this.v2);
  }
  
  public static void main(String[] args) {
    Test03_2 obj = new Test03_2();
    obj.v1 = 10;
    obj.v2 = 20;
    
    A obj2= obj.new A();
    obj2.m1();
    System.out.println("\n----------");
    

    
    
    
  }
}
