package step06;

public class Test01_1 {
  static class Student {
    String name;
    int [] scores = new int[3];
    int total;
    float aver;
  } 
  
  public static void main(String[] args) {
    Student s;
    s = new Student();
    
    s.name = "홍길동";
    s.scores[0] = 100;
    s.scores[1] = 90;
    s.scores[2] = 80;
    s.total = s.scores[0] + s.scores[1] + s.scores[2];
    s.aver = s.total / 3f;
    
    System.out.printf("%s, %d, %d, %d, %d, %f\n",
        s.name, s.scores[0], s.scores[1], s.scores[2], s.total, s.aver);
    
    
  }

}
