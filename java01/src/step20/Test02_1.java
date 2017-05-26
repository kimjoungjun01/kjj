package step20;

import java.sql.DriverManager;

public class Test02_1 {
  public static void main(String[] args) throws Exception {
    com.mysql.jdbc.Driver mysqlDriver = new com.mysql.jdbc.Driver();
    
    DriverManager.registerDriver(mysqlDriver);
    
    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webappdb",
                                "webapp",
                                "1111");
    
    java.sql.Statement stmt = con.createStatement();
    
    java.sql.ResultSet rs = stmt.executeQuery("select mno, name, tel, email from memb");
    
    //next() 서버에서 결과를 한 개 가져온다
    while (rs.next()) {
      
      System.out.printf("%d, %s, %s, %s\n",
          rs.getInt("mno"), rs.getString("name"), rs.getString("tel"), rs.getString("email"));
    }
    
    rs.close();
    stmt.close();
    con.close();
  }
}
