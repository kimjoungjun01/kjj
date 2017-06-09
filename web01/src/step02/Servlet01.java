package step02;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns="/step02/Servlet01")
public class Servlet01 extends GenericServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    System.out.printf("RemoteHost: %s\n", req.getRemoteHost());
    System.out.printf("RemoteAddr: %s\n", req.getRemoteAddr());
    System.out.printf("RemotePort: %s\n", req.getRemotePort());
    System.out.printf("Scheme: %s\n", req.getScheme());
    System.out.printf("parameter name: %s\n", req.getParameter("name"));
    System.out.printf("parameter age: %s\n", req.getParameter("age"));
  }
  
}
