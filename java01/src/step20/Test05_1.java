package step20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test05_1 {
  public static void main(String[] args) throws Exception {
    
    String jdbcDriver = "com.mysql.jdbc.Driver";
    String jdbcUrl =  "jdbc:mysql://localhost:3306/webappdb";
    String jdbcUserName = "webapp";
    String jdbcPassWord = "1111";
    
    String name = "홍길동101";
    String email = "hong101@test.com";
    String tel = "1111-1111";
    String password = "1111";
    
    try {
      Class.forName(jdbcDriver);
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    
    try (
        Connection con = DriverManager.getConnection(jdbcUrl,jdbcUserName,jdbcPassWord);
        Statement stmt = con.createStatement();
    ) {
      int count = stmt.executeUpdate("insert into memb(name,tel,email,pwd)" + " values('" + name +"', '" + tel + "', '" + email + "', password('" + password + "'))");
      System.out.println(count);
    } catch (Exception e) {
      e.printStackTrace();
    }
    
  }
}
