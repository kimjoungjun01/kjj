package step02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns="/step02/Servlet05")
public class Servlet05 extends GenericServlet {
  private static final long serialVersionUID = 1L;

//받는건 req.setCharacterEncoding("UTF-8"); 이건데
//보내는건 res.setContentType("text/plain;charset=UTF-8"); 이거 
//물론  PrintWriter out = res.getWriter(); 이거 전에 호출해야한다 
  @Override
  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    res.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = res.getWriter();
    out.println("Hello, world!");
    out.println("안녕하세요");
  }
}

