package bitcamp.java93.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;

import bitcamp.java93.control.Controller;

@WebServlet(urlPatterns="*.do")
public class DispatcherServlet  extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    try {
      String controllerPath = req.getServletPath().replace(".do", "");
      
      res.setContentType("text/html;charset=UTF-8");
      
      ApplicationContext beanContainer = (ApplicationContext)this.getServletContext().getAttribute("beanContainer");
      
      Controller pageController = (Controller)beanContainer.getBean(controllerPath);
      
      if ( pageController == null) {
        throw new ServletException("요청한 URL을 처리할 수 없어요");
      }
      
      String viewPath = pageController.service(req, res);
      
      if (viewPath.startsWith("redirect:")) {
        res.sendRedirect(viewPath.replaceAll("redirect:", "")); 
                         //redirect:list.do 로 url이 넘어온다면 list.do 로 바꾼다음 리다이렉트 시킨다
        return;
      } 
      
      RequestDispatcher rd = req.getRequestDispatcher(viewPath);
      rd.include(req, res);
      //view 를 누가 던져주나 = TeacherList에서 던져줌 - teacher/list.jsp 경로를 view라는 이름으로
      //                      = 그 외 detail 에서도
      
    } catch (Exception e) {
      req.setAttribute("error", e); // ServletRequest 보관소에 오류 정보를 보관한다.
      RequestDispatcher rd = req.getRequestDispatcher("/error.jsp");
      rd.forward(req, res);
      return;
    }
    
  }
}









