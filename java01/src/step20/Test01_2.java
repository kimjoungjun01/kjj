package step20;

import java.sql.DriverManager;

public class Test01_2 {
  public static void main(String[] args) throws Exception {
    com.mysql.jdbc.Driver mysqlDriver = new com.mysql.jdbc.Driver();
    
    DriverManager.registerDriver(mysqlDriver);
    
    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webappdb",
                                "webapp",
                                "1111");
    
    System.out.println("DBMS와 연결되었음!");
    
    con.close();
  }
}
