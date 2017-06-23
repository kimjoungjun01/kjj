package cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cookie/CookieServlet")
public class CookieServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String str = req.getParameter("String");
    
    Cookie cookie = new Cookie("String", str);
    resp.addCookie(cookie);
    
    
    resp.setContentType("text.plain;charset=UTF-8");
    PrintWriter out = resp.getWriter();
    
    out.printf("%s = %s", cookie.getName(), cookie.getValue());
    
  }
  
}
