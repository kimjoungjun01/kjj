package step11;

import step15.SchoolLevel2;
import step15.Student3;

public class Test10 {
  static enum SchoolLevel {
    HIGH_SCHOOL,
    BACHELOR,
    MASTER,
    DOCTOR;
    
  }
  
  static class Student {

    //필드 선언
    private String name;
    private int age;
    private SchoolLevel level;
    
    
    
    
    
    public String toString() {
      return "Student [name=" + name + ", age=" + age + ", level=" + level + "]";
    }
    public String getName() {
      return name;
    }
    public void setName(String name) {
      this.name = name;
    }
    public int getAge() {
      return age;
    }
    public void setAge(int age) {
      this.age = age;
    }
    public SchoolLevel getLevel() {
      return level;
    }
    public void setLevel(SchoolLevel level) {
      this.level = level;
    }
    
    public static void main(String[] args) {
      Student s = new Student();
      s.setName("홍길동");
      s.setAge(20);
      s.setLevel(SchoolLevel.MASTER);

      System.out.println(s);
    }
    
  }
}