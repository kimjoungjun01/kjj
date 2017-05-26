package step19;

public class Test02 {
  static class MyThread extends Thread {
    
    public void run() {
      System.out.println("MyThread......");
    }
  }
  static class MyJob implements Runnable {

    public void run() {
      System.out.println("MyJob......");
    }
  }
  
  public static void main(String[] args) {
    MyThread t = new MyThread();
    t.start();
    
    MyJob job = new MyJob();
    Thread t2 = new Thread(job);
    
    t2.start();
  }
  
}
