package step28.ex1;

import java.util.List;

public abstract class Test01 {

  public static void main(String[] args) throws Exception{
    DBConnectionPool conPool = new DBConnectionPool(
        "com.mysql.jdbc.Driver",
        "jdbc:mysql://localhost:3306/webappdb",
        "webapp",
        "1111");
    
    MemberDao memberDao = new MemberDaoImpl();
    memberDao.setDBConnectionPool(conPool);
    
    List<Member> list = memberDao.selectList(1, 5);
    for(Member m : list) {
      System.out.printf("%d, %s, %s, %s\n", m.getNo(), m.getName(), m.getEmail(), m.getTel());
    }
    
  }

}
