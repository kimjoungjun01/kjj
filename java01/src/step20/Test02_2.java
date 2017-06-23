package step20;

import java.sql.DriverManager;

public class Test02_2 {
  public static void main(String[] args) throws Exception {
    com.mysql.jdbc.Driver mysqlDriver = new com.mysql.jdbc.Driver();
    
    DriverManager.registerDriver(mysqlDriver);
    
    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webappdb",
                                "webapp",
                                "1111");
    
    java.sql.Statement stmt = con.createStatement();
    
    int count = stmt.executeUpdate("insert into memb(name,tel,email,pwd)" + " values('홍길동', '1212-1313', 'hong100@test.com', password('1111'))");
    
    System.out.println(count);
    
    stmt.close();
    con.close();
  }
}
