package step04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/step04/Servlet01/b")
public class Servlet01_B extends GenericServlet {
  private static final long serialVersionUID = 1L;

  //받는건 req.setCharacterEncoding("UTF-8"); 이건데
  //보내는건 res.setContentType("text/plain;charset=UTF-8"); 이거 
  //물론  PrintWriter out = res.getWriter(); 이거 전에 호출해야한다 
  @Override
  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

    
    res.setContentType("text/html;charset=UTF-8");
    PrintWriter out = res.getWriter();


    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset='UTF-8'>");
    out.println("  <title>리프레시 I</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("  <h1>화면B</h1>");
    out.println("</body>");
    out.println("</html>");

  }
}

