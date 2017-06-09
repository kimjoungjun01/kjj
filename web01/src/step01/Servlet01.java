package step01;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns="/step01/Servlet01")
public class Servlet01 implements Servlet {
  
  public Servlet01() {
    System.out.println("Servlet01");
  }

  @Override
  public void init(ServletConfig config) throws ServletException {
    System.out.println("Servlet01init");    
  }

  @Override
  public ServletConfig getServletConfig() {
    System.out.println("Servlet01getServletConfig");   
    return null;
  }

  @Override
  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    System.out.println("Servlet01service");       
  }

  @Override
  public String getServletInfo() {
    System.out.println("Servlet01getServletInfo");   
    return null;
  }

  @Override
  public void destroy() {
    System.out.println("Servlet01destroy");

  }
  

}
