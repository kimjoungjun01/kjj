package step12;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/step12/Servlet04")
public class Servlet04 extends HttpServlet{
  private static final long serialVersionUID = 1L;
  
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//    Cookie cookie = new Cookie("c4", "ABC가각간");
    //만일 한글을 포함한 문자열이 자동으로 URL 인코딩이 되지 않는다면
    //다음과 같이 개발자가 URL 인코딩을 수행하라
    Cookie cookie = new Cookie("c4", URLEncoder.encode("ABC가각간", "UTF-8"));
    
    cookie.setMaxAge(10);
    resp.addCookie(cookie);
    
    resp.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = resp.getWriter();
    out.println("쿠키보냈음");
  }
}
