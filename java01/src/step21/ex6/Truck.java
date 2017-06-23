package step21.ex6;

public class Truck extends Loader {
  
  public Truck(String model, String maker, int cc) {
    super(model, maker, cc);
  }
  
  public void run() {
    System.out.println("부왕~~~~ 힘차게 달린다.");
  }
  
  public void load(Object obj) {
    if (obj != null) {
      super.load(obj);
    } else {
      System.out.println("실은게 없는데?");
    }
    
  }
  public void dump() {
    if (storage != null) {
      System.out.printf("%s(을)를 내렸습니다.\n", this.storage);
      this.storage = null;

    } else {
      System.out.println("내릴게 없는데?");

    }
  }
  
}
