package step11.ex1;

public class Test05 extends A{
  
  public static void main(String[] args) {
    A obj = new A();
//    obj.v1 = 1;//private
    obj.v2 = 2;//(default) //A와 같은 패키지인경우 가능
    obj.v3 = 3;//protected //A와 같은 패키지인경우 가능
    obj.v4 = 4; // public
  }
}
