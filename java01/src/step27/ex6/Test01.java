package step27.ex6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
  public static void main(String[] args) {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("step27/ex6/application-context-01.xml");

    System.out.println("----------------------------------------------");
    
    String[] names = ctx.getBeanDefinitionNames();
    
    for(String name : names) {
      System.out.println(ctx.getBean(name));
    }
    
    Car c = new Car("티코", 10, new Engine(10, 6));
    
    System.out.println(c);
    
 
  }
}
