package step21.ex6;

public class Tesla extends Motor implements Vehicle {
  int charge;
  
  public void doCharge() {
    charge = 100;
  }
  
  public void run() {
    System.out.println("조용히 달린다...");
  }
}
