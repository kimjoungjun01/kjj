package step11;

public class Test09 {
  static class Student {
    
    public static final int HIGH_SCHOOL = 1;
    public static final int BACHELOR = 2;
    public static final int MASTER = 3;
    public static final int DOCTOR = 4;
    
    //필드 선언
    private String name;
    private int age;
    private int level;
    
    //프로퍼티 선언
    //=> 필드의 값을 넣거나 꺼내는 메서드
    //=> setXxx()/getXxx() 이름으로 메서드를 정의한다
    //=>그래서 setXxx() 메서드를 셋터(setter)라고 부른다
    //=>그래서 getXxx() 메서드를 겟터(getter)라고 부른다
    
    
    //사실 특별한 경우를 제외하면 프로퍼티명과 필드명을 다르게 하는 경우가 거의없다
    //필드 명 name
    //프로퍼티 명 fullName
    public void setFullName(String fullName) {
      //프로퍼티명이라 하면 겟터와 셋터를 말함이다.
      name = fullName;
    }
    
    public String getFullName() {
      return name;
    }
    
    public void setAge(int age) {
      if (age > 5 && age <100) {
        this.age = age;
      }
      throw new RuntimeException("나이는 6에서 99 까지 가능합니다");
    }
    public int getAge() {
      return age;
    }
    
    public void setSchoolLevel(int level) {
      if (level >= 1 && level <= 4) {
        this.level =level;
      }
      throw new RuntimeException("나이는 6에서 99 까지 가능합니다");
    }
    
    public int getSchoolLevel() {
      return level;
    }
  }
  
  public static void main(String[] args) {
    Student s = new Student();
    s.setFullName("홍길동");
    s.setAge(20);
    s.setSchoolLevel(Student.DOCTOR);
  }
}