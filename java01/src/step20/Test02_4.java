package step20;

import java.sql.DriverManager;

public class Test02_4 {
  public static void main(String[] args) throws Exception {
    com.mysql.jdbc.Driver mysqlDriver = new com.mysql.jdbc.Driver();
    
    DriverManager.registerDriver(mysqlDriver);
    
    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webappdb",
                                "webapp",
                                "1111");
    
    java.sql.Statement stmt = con.createStatement();
    
    int count = stmt.executeUpdate("delete from memb where email='user01@test.com'");
    
    System.out.println(count);
    
    stmt.close();
    con.close();
  }
}
