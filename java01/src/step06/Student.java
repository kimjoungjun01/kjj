package step06;
//test01_4
//클래스 안에 정의된 클래스를 별도의 파일로 분리시킬땐 static 을 붙이면 안됨
  //요거 기억하고 생각할 것 
  //Student 라는 타입을 만들어낸 것이다
  class Student {
    String name;
    int [] scores = new int[3];
    int total;
    float aver;
    //클래스 안에 묶어놓았을 경우 클래스에 묶여있기 때문에 호출할때 클래스이름을 언급해야함
    //호출 해야하는 메서드를 "클래스 메서드"라 한다
    public static void init(Student s, String name, int kor, int eng, int math){
      s.name = name;
      s.scores[0] = kor;
      s.scores[1] = eng;
      s.scores[2] = math;
    }
      
    public static void compute(Student s) {
      s.total = s.scores[0] + s.scores[1] + s.scores[2];
      s.aver = s.total / 3f;
    }
    public static void print(Student s) {
      System.out.printf("%s, %d, %d, %d, %d, %f\n",
          s.name, s.scores[0], s.scores[1], s.scores[2], s.total, s.aver);
    }
    
  }

