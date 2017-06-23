package step20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test05_2 {
  public static void main(String[] args) throws Exception {
    
    String jdbcDriver = "com.mysql.jdbc.Driver";
    String jdbcUrl =  "jdbc:mysql://localhost:3306/webappdb";
    String jdbcUserName = "webapp";
    String jdbcPassWord = "1111";
    
    String name = "홍길동103";
    String email = "hong103@test.com";
    String tel = "1111-1111";
    String password = "1111";
    
    try {
      Class.forName(jdbcDriver);
    } catch (Exception e) {
      e.printStackTrace();
    }
        
    
    
    try (
        Connection con = DriverManager.getConnection(jdbcUrl,jdbcUserName,jdbcPassWord);
        PreparedStatement stmt = con.prepareStatement(
            "insert into memb(name,tel,email,pwd) values(?,?,?,password(?))");
    ) {
      stmt.setString(1, name);
      stmt.setString(2, tel);
      stmt.setString(3, email);
      stmt.setString(4, password);
      
      int count = stmt.executeUpdate();
      System.out.println(count);
    } catch (Exception e) {
      e.printStackTrace();
    }
    
  }
}
