package bitcamp.java93.listener;

import java.util.HashMap;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@WebListener
public class ContextLoderListener implements ServletContextListener {
  HashMap<String,Object> objMap = new HashMap<>(); // 객체를 담을 바구니

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    try {
      ServletContext sc = sce.getServletContext();
      ApplicationContext appCtx = new ClassPathXmlApplicationContext(
          "bitcamp/java93/application-context.xml");
      
      sc.setAttribute("beanContainer", appCtx);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {
  }

}
