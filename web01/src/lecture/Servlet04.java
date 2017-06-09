/* 회원 관리 만들기 : 회원 조회하기 
 * => MemberDao를 이용하여 클라이언트가 보낸 번호에 해당하는 회원 정보 찾아
 *    HTML로 만들어 출력한다. 
 */
package lecture;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns="/lecture/Servlet04")
public class Servlet04  extends GenericServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    res.setContentType("text/html;charset=UTF-8");
    PrintWriter out = res.getWriter();
    
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("  <meta charset='UTF-8'>");
    out.println("  <title>회원관리</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>회원 조회</h1>");
    
    String jdbcDriver = "com.mysql.jdbc.Driver";
    String jdbcUrl = "jdbc:mysql://localhost:3306/webappdb";
    String jdbcUsername = "webapp";
    String jdbcPassword = "1111";
    
    try {
      DBConnectionPool conPool = new DBConnectionPool(
          jdbcDriver, jdbcUrl, jdbcUsername, jdbcPassword);
      
      LectureDao lectureDao = new LectureDao(conPool);
      
      int no = Integer.parseInt(req.getParameter("no"));
      
      Lecture lecture = lectureDao.selectOne(no);
      if (lecture == null) {
        throw new Exception(no + "번 회원이 없습니다.");
      }
      
      out.printf("<form action='Servlet05' method='POST'>\n");
      out.printf("번호:<input type='text' name='no' value='%d' readonly><br>\n", lecture.getNo());
      out.printf("강의실일련번호:<input type='text' name='crmno' value='%d'><br>\n", lecture.getCrmno());
      out.printf("매니저일련번호:<input type='text' name='mrno' value='%d'><br>\n", lecture.getMrno());
      out.printf("타이틀:<input type='text' name='titl' value='%s'><br>\n", lecture.getTitl());
      out.printf("설명:<input type='text' name='dscp' value='%s'><br>\n", lecture.getDscp());
      out.printf("시작일:<input type='text' name='sdt' value='%s'><br>\n", lecture.getSdt());
      out.printf("종료일:<input type='text' name='edt' value='%s'><br>\n", lecture.getEdt());
      out.printf("수강가능인원:<input type='text' name='qty' value='%s'><br>\n", lecture.getQty());
      out.printf("수업료:<input type='text' name='pric' value='%s'><br>\n", lecture.getPric());
      out.printf("총시간:<input type='text' name='thrs' value='%s'><br>\n", lecture.getThrs());
      

      out.println("<button>변경</button>");
      out.println("<button type='button' onclick='doDelete()'>삭제</button>");
      out.println("<button type='button' onclick='doList()'>목록</button>");
      out.println("</form>");
      
      
    } catch (Exception e) {
      out.println("오류 발생!");
      out.println("<pre>");
      e.printStackTrace(out);
      out.println("</pre>");
      out.println("<a href='Servlet02'>목록</a>");
    }
    
    out.println("<script>");
    out.println("function doDelete() {");
    out.printf("location.href = 'Servlet06?no=%s'\n", req.getParameter("no"));
    out.println("}");
    
    out.println("function doList() {");
    out.println("location.href = 'Servlet02'");
    out.println("}");
    
    out.println("</script>");
    
    out.println("</body>");
    out.println("</html>");
  }
}









