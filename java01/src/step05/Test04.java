package step05;

public class Test04 {
  
  
  public static java.util.ArrayList getStudent(int studentNo) {
    java.util.ArrayList arr = new java.util.ArrayList();
    arr.add("홍길동");
    arr.add(100);
    arr.add(90);
    arr.add(80);
    arr.add(100 + 90 + 80);
    arr.add((100 + 90 + 80) / 3f);
    return arr;
  }
  
  public static void main(String[] args) {
    java.util.ArrayList list = getStudent(100);
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
   
  

  }
}
