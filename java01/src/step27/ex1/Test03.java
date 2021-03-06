package step27.ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scripting.support.StandardScriptEvalException;

public class Test03 {
  public static void main(String[] args) throws Exception {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("step27/ex1/application-context-02.xml");
    
    Car obj2 = (Car)ctx.getBean("c2");
    Car obj3 = (Car)ctx.getBean("c3");
    Car obj4 = (Car)ctx.getBean("c4");
    Car obj5 = (Car)ctx.getBean("c5");
    
    if(obj2 == obj5) {
      System.out.println("c2나 c5 모두 같은객체이다");
    }
    
    System.out.println(ctx.getBean("c6"));
    System.out.println(ctx.getBean("c7"));
    System.out.println(ctx.getBean("c8"));
    
    String[] aliases = ctx.getAliases("c7");
    
    for (String alias : aliases) {
      System.out.println(alias);
    }
  }
}
