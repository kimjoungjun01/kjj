package step08;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/step08/ServletX")
public class ServletX extends HttpServlet {
  private static final long serialVersionUID = 1L;

  public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    ServletContext sc = this.getServletContext();
    String v1 = (String)sc.getAttribute("v1");
    String v2 = (String)sc.getAttribute("v2");
    
    
    res.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = res.getWriter();
    out.printf("v1=%s\n", v1);
    out.printf("v2=%s\n", v2);
  }
}

