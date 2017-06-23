package step22.ex2;

import java.util.List;

public class Test01_1 {
  public static void main(String[] args) throws Exception {
    
    String jdbcDriver = "com.mysql.jdbc.Driver";
    String jdbcUrl =  "jdbc:mysql://localhost:3306/webappdb";
    String jdbcUserName = "webapp";
    String jdbcPassWord = "1111";
    
    MemberDao memberDao = new MemberDao(jdbcDriver, jdbcUrl, jdbcUserName, jdbcPassWord);
    List<Member> list = memberDao.selectList();
    for (Member m : list) {
      System.out.printf("%d, %s, %s, %s\n", m.getNo(), m.getName(), m.getTel(), m.getEmail());
    }
    System.out.println("────────────────────────────────────────────────────────────────────");
 
    /*
    memberDao.delete(39);
    memberDao.selectList();    
    System.out.println("────────────────────────────────────────────────────────────────────");
    
    Member member = new Member();
    member.setName("홍길동104");
    member.setTel("1111-1111");
    member.setEmail("hong104@test.com");
    member.setPassword("1111");
    System.out.println(memberDao.insert(member));
    System.out.println("────────────────────────────────────────────────────────────────────");
    */
    
    Member member = new Member();
    member.setNo(40);
    member.setName("홍길동 변경");
    member.setTel("1111-2221");
    member.setEmail("hong105@test.com");
    member.setPassword("1111");
    memberDao.update(member);
    System.out.println("────────────────────────────────────────────────────────────────────");  
     
    list = memberDao.selectList();
    for (Member m : list) {
      System.out.printf("%d, %s, %s, %s\n", m.getNo(), m.getName(), m.getTel(), m.getEmail());
    }
    
  }
}
