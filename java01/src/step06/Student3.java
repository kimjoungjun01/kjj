package step06;
//test01_6
//클래스 안에 정의된 클래스를 별도의 파일로 분리시킬땐 static 을 붙이면 안됨
  //요거 기억하고 생각할 것 
  //Student 라는 타입을 만들어낸 것이며 새로운 클래스를 생성한 것이다
    class Student3 {
    String name;
    int [] scores = new int[3];
    int total;
    float aver;
    //이것은 인스턴스 메서드!
    //static가 붙지않는 메서드를 "인스턴스 메서드"라 부르다
    //호출하려면 반드시 인스턴스 주소를 줘야 한다.
    //이렇게 메서드를 호출할 때 앞에 놓이는 인스턴스 주소는 this라는 내장 변수에 자동으로 저장된다!
    //즉, Student s 와 같이 s를 반드시 파라미터로 받을 필요가 없다는 뜻이다.
    //static 환경에서는 this 내장변수를 사용할 수 없다.
    //편리하다
    
    public Student3(String name, int kor, int eng, int math) {
      this.name = name;
      this.scores[0] = kor;
      this.scores[1] = eng;
      this.scores[2] = math;
    }
      
    public void compute() {
      this.total = this.scores[0] + this.scores[1] + this.scores[2];
      this.aver = this.total / 3f;
    }
    public void print() {
      System.out.printf("%s, %d, %d, %d, %d, %f\n",
          this.name, this.scores[0], this.scores[1], this.scores[2], this.total, this.aver);
    }
    
  }

