package step20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Test04_1 {
  public static void main(String[] args) {
    
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    try {
//      com.mysql.jdbc.Driver mysqlDriver = new com.mysql.jdbc.Driver();
//      DriverManager.registerDriver(mysqlDriver);
      
      //이렇게 하면 mysql 에 종속되지 않고 오라클이나 다른 dbms 를 사용가능하다
      //명령창에서 실행법= java -cp bin:xxx.jar -Djdbc.driver=com.mysql.jdbc.Driver step20.Test04_1
      //이클립스 실행법=
      //일단 그냥실행하고, 에러를띄운뒤
      //Run Configurations....  에서 VM arguments에 -Djdbc.driver=com.mysql.jdbc.Driver 
      String driverClassName = System.getProperty("jdbc.driver");
      Class.forName(driverClassName);
          
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webappdb",
          "webapp",
          "1111");

      stmt = con.createStatement();

      rs = stmt.executeQuery("select mno, name, tel, email from memb");

      while (rs.next()) {

        System.out.printf("%d, %s, %s, %s\n",
            rs.getInt("mno"), rs.getString("name"), rs.getString("tel"), rs.getString("email"));
      }
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {rs.close();} catch (Exception e) {}
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }
    
  } 
}   
    