/* 회원 관리 만들기 : 회원 조회하기 
 * => MemberDao를 이용하여 클라이언트가 보낸 번호에 해당하는 회원 정보 찾아
 *    HTML로 만들어 출력한다. 
 */
package lecture;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;



@WebServlet(urlPatterns="/lecture/form")
public class LectureFormServlet  extends GenericServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    res.setContentType("text/html;charset=UTF-8");
    PrintWriter out = res.getWriter();
    
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("  <meta charset='UTF-8'>");
    out.println("  <title>강의등록</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>강의 등록</h1>");
    
    String jdbcDriver = "com.mysql.jdbc.Driver";
    String jdbcUrl = "jdbc:mysql://localhost:3306/webappdb";
    String jdbcUsername = "webapp";
    String jdbcPassword = "1111";
    
    try {
      
      DBConnectionPool conPool = new DBConnectionPool(
          jdbcDriver, jdbcUrl, jdbcUsername, jdbcPassword);
      
      LectureDao lectureDao = new LectureDao(conPool);
      CroomDao croomDao = new CroomDao(conPool);
      List<Croom> classRoomList = croomDao.selectList();
      
      out.printf("<form action='Servlet03' method='POST'>\n");
      out.printf("강의실일련번호:<select name='crmno'>");
      out.printf("<option value='0'></option>");
      
      for (Croom c : classRoomList) {
        
        out.printf("<option value= %d>%s</option>", c.getNo(), c.getName());
      }
      
      out.println("</select><br>\n");
      out.printf("매니저일련번호:<input type='text' name='mrno'><br>\n");
      out.printf("타이틀:<input type='text' name='titl'><br>\n");
      out.printf("설명:<input type='text' name='dscp' ><br>\n");
      out.printf("시작일:<input type='date' name='sdt'><br>\n");
      out.printf("종료일:<input type='date' name='edt' ><br>\n");
      out.printf("수강가능인원:<input type='text' name='qty'><br>\n");
      out.printf("수업료:<input type='text' name='pric'><br>\n");
      out.printf("총시간:<input type='text' name='thrs'><br>\n");
      out.printf("<button>등록</button>");
      

      out.println("</form>");
      
      
    } catch (Exception e) {
      out.println("오류 발생!");
      out.println("<pre>");
      e.printStackTrace(out);
      out.println("</pre>");
      out.println("<a href='Servlet02'>목록</a>");
    }
    
    out.println("</body>");
    out.println("</html>");
    
  }
}









