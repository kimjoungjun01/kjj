package croom;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import croom.DBConnectionPool;

@WebServlet(urlPatterns="/croom/Servlet03")
public class Servlet03 extends GenericServlet {
  private static final long serialVersionUID = 1L;

//받는건 req.setCharacterEncoding("UTF-8"); 이건데
//보내는건 res.setContentType("text/plain;charset=UTF-8"); 이거 
//물론  PrintWriter out = res.getWriter(); 이거 전에 호출해야한다 
  @Override
  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    req.setCharacterEncoding("UTF-8");
    
    Croom c = new Croom();
    
    c.setName(req.getParameter("name"));
 
    res.setContentType("text/html;charset=UTF-8");
    PrintWriter out = res.getWriter();
    
    
    
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("  <meta charset='UTF-8'>");
    out.println("  <title>교실관리</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("  <h1>교실등장</h1>");
    
    
    String jdbcDriver = "com.mysql.jdbc.Driver";
    String jdbcUrl =  "jdbc:mysql://localhost:3306/webappdb";
    String jdbcUserName = "webapp";
    String jdbcPassWord = "1111";
    
    try{
      DBConnectionPool conPool = new DBConnectionPool(jdbcDriver, jdbcUrl, jdbcUserName, jdbcPassWord);
      
      CroomDao croomDao = new CroomDao(conPool);
      
      croomDao.insert(c);
      out.println("<p>등록성공입니다</p>");
      
    } catch (Exception e) {
        out.println("오류 발생");
        out.println("<pre>");
        e.printStackTrace(out);
        out.println("</pre>");
    }
    
    out.println("<a href='Servlet02'>목록</a>");
    
    out.println("</body>");
    out.println("</html>");
    
  }
}
