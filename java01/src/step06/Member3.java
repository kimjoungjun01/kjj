package step06;
//test02_7
class Member3 {
  //static 이 붙었을때와 안붙었을 떄의 차이점에 대해 생각할 것
  //static 이 안붙은 변수를 인스턴스 변수라 한다.
  String name;
  int[] scores = new int[3];
  int total;
  float aver;
  
  public void init(String name, int kor, int eng, int math){
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
