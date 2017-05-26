package step13;

//nested class(=inner class)

public class Test02_3 {
  
  static class Member {
    String name;
    String tel;
    int schoolLevel;
    int userType;
    int working;
    int language;
  }
  
  
  public static void main(String[] args) {
    Member m = new Member();
    m.name = "홍길동";
    m.tel = "111-1111";
    m.schoolLevel = Constants.school.BACHELOR;
    m.userType = Constants.userType.TEACHER;
    m.working = Constants.work.NOT_WORKING;
    m.language = Constants.lang.JAVA;
  }
}
