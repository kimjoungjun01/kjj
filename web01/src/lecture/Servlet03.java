package lecture;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns="/lecture/Servlet03")
public class Servlet03 extends GenericServlet {
  private static final long serialVersionUID = 1L;

//받는건 req.setCharacterEncoding("UTF-8"); 이건데
//보내는건 res.setContentType("text/plain;charset=UTF-8"); 이거 
//물론  PrintWriter out = res.getWriter(); 이거 전에 호출해야한다 
  @Override
  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    req.setCharacterEncoding("UTF-8");
    
    Lecture l = new Lecture();
    
    l.setTitl(req.getParameter("titl"));
    l.setCrmno(Integer.parseInt(req.getParameter("crmno")));
    l.setSdt(req.getParameter("sdt"));
    l.setEdt(req.getParameter("edt"));
    l.setQty(Integer.parseInt(req.getParameter("qty")));
    l.setPric(Integer.parseInt(req.getParameter("pric")));
    l.setThrs(req.getParameter("thrs"));
    l.setMrno(Integer.parseInt(req.getParameter("mrno")));
    l.setDscp(req.getParameter("dscp"));

 
    res.setContentType("text/html;charset=UTF-8");
    PrintWriter out = res.getWriter();
    
    
    
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("  <meta charset='UTF-8'>");
    out.println("  <title>교실관리</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("  <h1>교실등록</h1>");
    
    
    String jdbcDriver = "com.mysql.jdbc.Driver";
    String jdbcUrl =  "jdbc:mysql://localhost:3306/webappdb";
    String jdbcUserName = "webapp";
    String jdbcPassWord = "1111";
    
    try{
      DBConnectionPool conPool = new DBConnectionPool(jdbcDriver, jdbcUrl, jdbcUserName, jdbcPassWord);
      
      LectureDao letureDao = new LectureDao(conPool);
      
      letureDao.insert(l);
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

