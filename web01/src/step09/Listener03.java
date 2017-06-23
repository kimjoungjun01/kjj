package step09;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

//@WebListener
public class Listener03 implements ServletRequestAttributeListener{

  @Override
  public void attributeAdded(ServletRequestAttributeEvent sce) {
    System.out.printf("Listener03.attributeAdded(): %s=%s\n", sce.getName(), sce.getValue());    
  }

  @Override
  public void attributeRemoved(ServletRequestAttributeEvent sce) {
    System.out.println("Listener03.attributeRemoved");
  }

  @Override
  public void attributeReplaced(ServletRequestAttributeEvent sce) {
    
    System.out.println("Listener03.attributeReplaced");   
  }

  

  
}
