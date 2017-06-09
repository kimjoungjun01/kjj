package step02;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
//파라미터 값 전달 방법: http://localhost:8080/web01/step0x/Servlet0x?파라미터=값&파라미터=값

//한글 깨지면 Servers/server.xml 에 있는 <Connector connectionTimeout="20000" port="8080" protocol="HTTP/1.1" redirectPort="8443"/>
//에 URIEncoding="UTF-8" 을 추가한다 톰캣 8이상부터는 그리할 필요가 없다. 
//GET 요청이 한글 꺠지면 위와같이 속성을 추가하는 수 밖에 없고
//POST가 꺠지면 프로그램 코드로 처리가 가능하다
// --> 예) req.setCharacterEncoding("UTF-8");
// 단, getParameter()를 최초!로 호출하기 전에 써줄 것

@WebServlet(urlPatterns="/step02/Servlet03")
public class Servlet03 extends GenericServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    req.setCharacterEncoding("UTF-8");
    System.out.printf("parameter name: %s\n", req.getParameter("name"));
    System.out.printf("parameter age: %s\n", req.getParameter("age"));
  }
  
}
