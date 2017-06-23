package step01;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
// 1)정확하게 url 패턴 지정하기
//@WebServlet(urlPatterns="/step01/Servlet01")

// 2)urlPatterns는 배열이기에 정확하게 배열의 형태로 값 지정하기
//@WebServlet("/step01/Servlet01")

// 3)여러 개의 url 지정하기
//@WebServlet(urlPatterns= { "/step01/Servlet01", "/step01/Servlet01_a", "/step01/Servlet01_b"})

// 4)value 속성에 지정하기, 두개의 속성은 같은 역할을 함
//@WebServlet(value = "/step01/Servlet01")

// 5)value 송성으로 url 을 지정할 경우 value 이름 생략가능
//@WebServlet("/step01/Servlet01")

// 6) 두 개 이상 송성값을 지정하는 경우 value 생략 불가
@WebServlet(value="/step01/Servlet01", loadOnStartup=1)
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
