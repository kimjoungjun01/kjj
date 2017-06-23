package step08;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/step08/Servlet01")
public class Servlet01 extends HttpServlet {
  private static final long serialVersionUID = 1L;
  

@Override
public void init() throws ServletException {
  System.out.println("============> step08.Servlet01.init()");
  ServletContext sc = this.getServletContext();
  sc.setAttribute("v1", "hello");
}


  @Override
  public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    System.out.println("============> step08.Servlet01.Service()");

    
  }
}

