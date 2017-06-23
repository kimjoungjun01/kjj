package step08;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

//@WebServlet(urlPatterns="/step08/Servlet02", loadOnStartup=1) 서버켤때 init()를 자동실행한다
//이렇게해도 되고 web.xml 파일에 직접 loadonstartup 속성을 줘도 된다 
public class Servlet02 extends HttpServlet {
  private static final long serialVersionUID = 1L;
  

  @Override
  public void init() throws ServletException {
    System.out.println("============> step08.Servlet02.init()");
    ServletContext sc = this.getServletContext();
    sc.setAttribute("v2", "hi");
  }

}

