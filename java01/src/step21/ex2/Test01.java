package step21.ex2;

public class Test01 {

  
  public static void main(String[] args) {
    Truck car1 = new Truck("타이탄", "비트자동차", 10000);
    
    car1.load("자갈");
    car1.run();
    car1.dump();
  }
}
