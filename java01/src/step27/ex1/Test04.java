package step27.ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scripting.support.StandardScriptEvalException;

public class Test04 {
  public static void main(String[] args) throws Exception {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("step27/ex1/application-context-03.xml");
    
    Object obj1 = ctx.getBean("c1");
    Object obj2 = ctx.getBean("c1");
    
    if(obj1 == obj2) System.out.println("obj1 == obj2");
    
    Object obj3 = ctx.getBean("c2");
    Object obj4 = ctx.getBean("c2");
    
    if(obj3 == obj4) System.out.println("obj3 == obj4");
    
    Object obj5 = ctx.getBean("c3");
    Object obj6 = ctx.getBean("c3");
    
    if(obj5 == obj6) System.out.println("obj5 == obj6");
  }
}
