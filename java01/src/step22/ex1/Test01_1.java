package step22.ex1;

import step09.ex3.C;

public class Test01_1 {
  public static void main(String[] args) throws Exception {
    
    String jdbcDriver = "com.mysql.jdbc.Driver";
    String jdbcUrl =  "jdbc:mysql://localhost:3306/webappdb";
    String jdbcUserName = "webapp";
    String jdbcPassWord = "1111";
    
    MemberDao memberDao = new MemberDao(jdbcDriver, jdbcUrl, jdbcUserName, jdbcPassWord);
    memberDao.selectList();    
    System.out.println("────────────────────────────────────────────────────────────────────");
 
    /*
    memberDao.delete(39);
    memberDao.selectList();    
    System.out.println("────────────────────────────────────────────────────────────────────");
    
    memberDao.insert("홍길동104", "hong104@test.com", "1111-1111", "1111");
    memberDao.selectList();    
    
    System.out.println("────────────────────────────────────────────────────────────────────");
    memberDao.update(39, "홍길동변경", "hong104@test.com", "1111-22222", "1313");
    memberDao.selectList();    
     */
    
  }
}
