package step22.ex3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MemberDao {
  DBConnectionPool conPool;
  
  public MemberDao(DBConnectionPool conPool) {
    this.conPool = conPool;
  }
  
  
  public List<Member> selectList() throws Exception {
    Connection con = conPool.getConnection();
    try (
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select mno, name, tel, email from memb");) {
      
      ArrayList<Member> list = new ArrayList<>();
      
      Member member = null;
      while (rs.next()) {
        member = new Member();
        member.setNo(rs.getInt("mno"));
        member.setName(rs.getString("name"));
        member.setTel(rs.getString("tel"));
        member.setEmail(rs.getString("email"));
        
        list.add(member);
      }
      
      return list;
      
    } finally {
      conPool.returnConnection(con);
    }
  }
  
  public int insert(Member member) throws Exception {
    Connection con = conPool.getConnection();
    
    try (
        PreparedStatement stmt = con.prepareStatement(
            "insert into memb(name,tel,email,pwd) values(?,?,?,password(?))");) {
      
      stmt.setString(1, member.getName());
      stmt.setString(2, member.getTel());
      stmt.setString(3, member.getEmail());
      stmt.setString(4, member.getPassword());

      return stmt.executeUpdate();
    } finally {
      conPool.returnConnection(con);
    }
  }
  
  public int delete(int no) throws Exception {
    Connection con = conPool.getConnection();
    
    try (
        PreparedStatement stmt = con.prepareStatement(
            "delete from memb where mno=?");
        ) {

      stmt.setInt(1, no);
      return stmt.executeUpdate();
    } finally {
      conPool.returnConnection(con);
    }

  }

  public int update(Member member) throws Exception {
    Connection con = conPool.getConnection();
  
  try (
      PreparedStatement stmt = con.prepareStatement(
          "update memb set name=?,tel=?,email=?,pwd=password(?) where mno=?");) {
    
    stmt.setString(1, member.getName());
    stmt.setString(2, member.getTel());
    stmt.setString(3, member.getEmail());
    stmt.setString(4, member.getPassword());
    stmt.setInt(5, member.getNo());
    
    return stmt.executeUpdate();
  } finally {
    conPool.returnConnection(con);
  }

}
  
  
  
}
