package step13;


public class Test03_3 {
  int v1;
  int v2;
  
  class A {
    int v1 = 200;
    public void m1() {
      System.out.printf("A.v1 = %d\n", v1);
      System.out.printf("A.v1 = %d\n", this.v1);
      System.out.printf("A.v1 = %d\n", A.this.v1);
      System.out.printf("Test03_3 = %d", Test03_3.this.v1);

    }
  }
  
  public static void main(String[] args) {
    Test03_3 obj = new Test03_3();
    obj.v1 = 10;
    obj.v2 = 20;
    A obj2= obj.new A();
    obj2.m1();
    System.out.println("\n----------");
    
  }
}
