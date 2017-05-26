package step19;

public class Test03 {
  static class MyThread extends Thread {
    public MyThread(String name) {
      this.setName(name);
    }
    
    public void run() {
      for (int i = 0; i < 1000; i++) {
        System.out.printf("[%s] %d\n", this.getName(), i);
      }
    }
  }

  
  public static void main(String[] args) {
    MyThread t1 = new MyThread("t1");
    MyThread t2 = new MyThread("t2");
    MyThread t3 = new MyThread("t3");
    
    t1.start();
    t2.start();
    t3.start();
    
    for (int i = 0; i < 1000; i++) {
      System.out.printf("[main] %d\n", i);
    }
  }
}
