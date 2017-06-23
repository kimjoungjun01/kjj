package step20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test05_3 {
  public static void main(String[] args) throws Exception {
    
    String jdbcDriver = "com.mysql.jdbc.Driver";
    String jdbcUrl =  "jdbc:mysql://localhost:3306/webappdb";
    String jdbcUserName = "webapp";
    String jdbcPassWord = "1111";
    
    String email = "hong103@test.com";
    
    try {
      Class.forName(jdbcDriver);
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    
    try (
        Connection con = DriverManager.getConnection(jdbcUrl,jdbcUserName,jdbcPassWord);
        Statement stmt = con.createStatement();
    ) {
      int count = stmt.executeUpdate("delete from memb where email='" + email + "'");
      System.out.println(count);
    } catch (Exception e) {
      e.printStackTrace();
    }
    
  }
}
