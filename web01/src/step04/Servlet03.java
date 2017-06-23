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

@WebServlet(urlPatterns="/step04/Servlet03")
public class Servlet03 extends GenericServlet {
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
    out.println("  <title>리다이렉트</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("  <h1>이 내용은 클라이언트로 보내지 않습니다</h1>");
    out.println("</body>");
    out.println("</html>");

    HttpServletRequest httpReq = (HttpServletRequest) req;
    HttpServletResponse httpRes = (HttpServletResponse) res;

    if (req.getParameter("page") == null) {
      httpRes.sendRedirect("Servlet01/a");
    } else if (req.getParameter("page").equals("b")) {
      httpRes.sendRedirect("Servlet01/b");
    } 
    
  }
}

