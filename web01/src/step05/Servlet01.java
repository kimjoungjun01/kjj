package step05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/step05/Servlet01")
public class Servlet01 extends HttpServlet {
  private static final long serialVersionUID = 1L;

  //받는건 req.setCharacterEncoding("UTF-8"); 이건데
  //보내는건 res.setContentType("text/plain;charset=UTF-8"); 이거 
  //물론  PrintWriter out = res.getWriter(); 이거 전에 호출해야한다 
  @Override
  public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

    res.setContentType("text/html;charset=UTF-8");
    PrintWriter out = res.getWriter();
    

    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset='UTF-8'>");
    out.println("  <title>포워딩</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("  <h1>더하기 결과</h1>");
    
    int a = Integer.parseInt(req.getParameter("a"));
    int b = Integer.parseInt(req.getParameter("b"));
    String op = req.getParameter("op");
    
    if (op.equals("+")) {
      out.printf("%d + %d = %d\n", a, b, (a + b));
    } else {
      RequestDispatcher rd = req.getRequestDispatcher("/step05/Servlet01/minus");
      
      rd.forward(req, res);
      
      return;
    }
    out.println("</body>");
    out.println("</html>");

  }
}

