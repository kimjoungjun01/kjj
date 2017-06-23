package step21.ex1;

public class Truck {
  String model;
  String maker;
  int cc;
  boolean auto;
  Object storage;
  
  
  public Truck(String model, String maker, int cc) {
    this.model = model;
    this.maker = maker;
    this.cc = cc;
  }
  
  public void run() {
    System.out.println("부왕~~~~ 힘차게 달린다.");
  }
  
  public void load(Object obj) {
    this.storage = obj;
    if (obj != null) {
      System.out.printf("%s를 실었습니다.\n", obj);
    } else {
      System.out.println("실은게 없는데?");
    }
    
  }
}
