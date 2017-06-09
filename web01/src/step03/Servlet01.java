package step03;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import step03.DBConnectionPool;
import step03.Member;
import step03.MemberDao;

@WebServlet(urlPatterns="/step03/Servlet01")
public class Servlet01 extends GenericServlet {
  private static final long serialVersionUID = 1L;

  //받는건 req.setCharacterEncoding("UTF-8"); 이건데
  //보내는건 res.setContentType("text/plain;charset=UTF-8"); 이거 
  //물론  PrintWriter out = res.getWriter(); 이거 전에 호출해야한다 
  @Override
  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

    int pageNo = 1;
    int pageSize = 5;

    try {
      pageNo = Integer.parseInt(req.getParameter("pageNo"));
    } catch (Exception e) {}

    try {
      pageNo = Integer.parseInt(req.getParameter("pageSize"));
    } catch (Exception e) {}


    res.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = res.getWriter();

    String jdbcDriver = "com.mysql.jdbc.Driver";
    String jdbcUrl =  "jdbc:mysql://localhost:3306/webappdb";
    String jdbcUserName = "webapp";
    String jdbcPassWord = "1111";

    try{
      DBConnectionPool conPool = new DBConnectionPool(jdbcDriver, jdbcUrl, jdbcUserName, jdbcPassWord);

      MemberDao memberDao = new MemberDao(conPool);

      List<Member> list = memberDao.selectList(pageNo, pageSize);

      for (Member m : list) {
        out.printf("%d, %s, %s, %s\n", m.getNo(), m.getName(), m.getTel(), m.getEmail());
      }
    } catch (Exception e) {
      out.println("오류 발생");
      e.printStackTrace(out);
    }


  }
}

