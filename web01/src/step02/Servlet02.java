package step02;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
//파라미터 값 전달 방법: http://localhost:8080/web01/step0x/Servlet0x?파라미터=값&파라미터=값
@WebServlet(urlPatterns="/step02/Servlet02")
public class Servlet02 extends GenericServlet {
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
