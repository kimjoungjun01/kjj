package croom;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns="/croom/Servlet02")
public class Servlet02 extends GenericServlet {
  private static final long serialVersionUID = 1L;

//받는건 req.setCharacterEncoding("UTF-8"); 이건데
//보내는건 res.setContentType("text/plain;charset=UTF-8"); 이거 
//물론  PrintWriter out = res.getWriter(); 이거 전에 호출해야한다 
  @Override
  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

    int pageNo = 1;
    int pageSize = 5;
    
    try {
      pageNo = Integer.parseInt(req.getParameter("pageNo"));
    } catch (Exception e) {}
    
    try {
      pageSize = Integer.parseInt(req.getParameter("pageSize"));
    } catch (Exception e) {}
    
    res.setContentType("text/html;charset=UTF-8");
    PrintWriter out = res.getWriter();
    
    
    
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset='UTF-8'>");
    out.println("  <title>교실 관리</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("  <h1>교실목록</h1>");
    
    
    String jdbcDriver = "com.mysql.jdbc.Driver";
    String jdbcUrl =  "jdbc:mysql://localhost:3306/webappdb";
    String jdbcUserName = "webapp";
    String jdbcPassWord = "1111";
    
    try{
      DBConnectionPool conPool = new DBConnectionPool(jdbcDriver, jdbcUrl, jdbcUserName, jdbcPassWord);
      
      CroomDao croomDao = new CroomDao(conPool);
      
      List<Croom> list = croomDao.selectList(pageNo, pageSize);
      
      out.println("<a href='form.html'>교실</a>");
      out.println("<table border='1'>");
      out.println("<thead>");
      out.println("  <tr><th>번호</th><th>교실이름</th>");
      out.println("</thead>");
      out.println("<tbody>");
      
      
      for (Croom c : list) {
        out.println("<tr>");
        out.printf("  <td>%d</td>\n", c.getNo());
        out.printf("  <td><a href='Servlet04?no=%d'>%s</a></td>\n", c.getNo(), c.getName());
        out.println("</tr>");
        System.out.println(c.getNo());
      }
      out.println(" </tbody>");
      out.println("</table>");
    } catch (Exception e) {
      out.println("오류 발생");
      out.println("<pre>");
      e.printStackTrace(out);
      out.println("</pre>");
    }
    
    out.println("</body>");
    out.println("</html>");
    
  }
}

