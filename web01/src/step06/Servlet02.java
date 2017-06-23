package step06;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/step06/Servlet02")
public class Servlet02 extends HttpServlet {
  private static final long serialVersionUID = 1L;

  //받는건 req.setCharacterEncoding("UTF-8"); 이건데
  //보내는건 res.setContentType("text/plain;charset=UTF-8"); 이거 
  //물론  PrintWriter out = res.getWriter(); 이거 전에 호출해야한다 
  @Override
  public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

    String value = (String)req.getAttribute("v1");
    
    res.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = res.getWriter();
    out.println(value);

  }
}

