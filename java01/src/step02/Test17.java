package step02;


public class Test17 {
  
  public static void main(String[] args) {
    
    //인스턴스 주소를 저장할 레퍼런스 배열을 만든다
    Student[] arr1 = new Student[3]; //레퍼런스를 3개만드는 것
                                    //인스턴스를 3개 만드는 것이 아니다
    
    
    arr1[0] = new Student("홍길동", 100, 100, 100);
    arr1[1] = new Student("임꺽정", 90, 90, 90);
    arr1[2] = new Student("유관순", 80, 80, 80);
    
    
    for (int i = 0; i < arr1.length; i++) {
      Student.print(arr1[i]);
    }
  }
}
