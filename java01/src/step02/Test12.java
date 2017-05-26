package step02;

public class Test12 {

  public static void main(String[] args) {
    //정의만 한 상태로 메모리는 준비되지 않은 상태
    class Student {
      String name;
      byte[] scores;
      short total;
      float aver;
    }
    
    Student s1;
    s1 = new Student();
    
    s1.name = "홍길동";
    s1.scores = new byte[3];
    s1.scores[0] = 100;
    s1.scores[1] = 100;
    s1.scores[2] = 100;
    s1.total = (short)(s1.scores[0] + s1.scores[1] + s1.scores[2]);
    s1.aver = s1.total / 3f;

    
    Student s2 = s1;
    s2.name = "임꺽정";    
    
    System.out.printf("%s, %d, %d, %d, %d, %f\n",
        s1.name, s1.scores[0], s1.scores[1], s1.scores[2], s1.total, s1.aver);
    System.out.printf("%s, %d, %d, %d, %d, %f\n",
        s2.name, s2.scores[0], s2.scores[1], s2.scores[2], s2.total, s2.aver);
    
  }
}
