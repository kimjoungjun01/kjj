package step21.ex4;

public class Test01 {

  
  public static void main(String[] args) {
    Truck car1 = new Truck("타이탄", "비트자동차", 10000);
    
    car1.load("자갈");
    car1.run();
    car1.dump();
    
//    Car car2 = new Car(); 추상클래스는 사용 못함
  }
}
