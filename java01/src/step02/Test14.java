package step02;

public class Test14 {
  
  static class Student {
    String name;
    byte[] scores;
    short total;
    float aver;
  }      
  public static Student createStudent(String name, byte kor, byte eng, byte math) {
    Student s = new Student();
    s.name = name;
    s.scores = new byte[]{kor, eng, math};
    s.total = (short)(kor + eng + math);
    s.aver = s.total / 3f;
    return s;
  }
  
  public static void main(String[] args) {
    
    //인스턴스 주소를 저장할 레퍼런스 배열을 만든다
    Student[] arr1 = new Student[3]; //레퍼런스를 3개만드는 것
                                    //인스턴스를 3개 만드는 것이 아니다
        
    
    arr1[0] = createStudent("홍길동", (byte)100, (byte)100, (byte)100);
    arr1[1] = createStudent("임꺽정", (byte)90, (byte)90, (byte)90);
    arr1[2] = createStudent("유관순", (byte)80, (byte)80, (byte)80);
    
    System.out.println(arr1[1].name);
    
    for (int i = 0; i < arr1.length; i++) {
      System.out.printf("%s, %d, %d, %d, %d, %f\n", 
        arr1[i].name, 
        arr1[i].scores[0], arr1[i].scores[1], arr1[i].scores[2], 
        arr1[i].total, arr1[i].aver);
    }
  }
}
