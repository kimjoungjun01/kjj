package step12;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/step12/Servlet02")
public class Servlet02 extends HttpServlet{
  private static final long serialVersionUID = 1L;
  
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    Cookie cookie = new Cookie("c2", "bbbb");
    
    
    cookie.setPath(req.getContextPath());// -->web01
    resp.addCookie(cookie);
    
    
    resp.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = resp.getWriter();
    out.println("쿠키보냈음");
  }
}
