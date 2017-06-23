package step21.ex6;

public class Test01 {

  
  public static void main(String[] args) {
    Truck car1 = new Truck("타이탄", "비트자동차", 10000);
    Sedan car2 = new Sedan("티코", "비트자동차", 980, true);
    Bulldozer car3 = new Bulldozer("제우스", "비트자동차", 20000, 30);
    Tesla car4 = new Tesla();
    
    car1.run();
    car2.run();
    car3.run();
    car4.run();
    
    System.out.println("------------------");
    CarTester.test(car1);
    System.out.println("------------------");
    CarTester.test(car2);
    System.out.println("------------------");
    CarTester.test(car3);
    System.out.println("------------------");
    CarTester.test(car4);
    
    
    
    
    
    
  }
}
