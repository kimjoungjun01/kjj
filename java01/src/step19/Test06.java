package step19;

public class Test06 {
  
  static class Worker {
    public void play() {
      System.out.println(("오호라~~놀자!"));
    }
  }
  
  static class MyThread extends Thread {
    Worker worker;
    
    public MyThread(Worker worker) {
      this.worker = worker;
    }
    
    public void run() {
      while (true) {
        worker.play();
        try {
          Thread.sleep(1000);
        } catch (Exception e) {}
      }
    }
  }

  
  public static void main(String[] args) {
    Worker worker = new Worker();
    MyThread t1 = new MyThread(worker);
    
    t1.start();
    
    System.out.println("main() 끝~");
  }
}
