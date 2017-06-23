package step27.ex13;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import step27.ex6.Car;

public class Test01 {
  public static void main(String[] args) {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("step27/ex13/application-context-01.xml");

    System.out.println("----------------------------------------------");
    
    String[] names = ctx.getBeanDefinitionNames();
    
    for(String name : names) {
      System.out.printf("%s ===> %s\n", name, ctx.getBean(name));
    }
    
    System.out.println("----------------------------------------------");
    
    names = ctx.getAliases("step27.ex13.Car2#0");
    
    for(String name : names) {
      System.out.printf("%s ===> %s\n", name, ctx.getBean(name));
    }
    
    System.out.println("----------------------------------------------");
    
    names = ctx.getAliases("step27.ex13.Car2#1");
    
    for(String name : names) {
      System.out.printf("%s ===> %s\n", name, ctx.getBean(name));
    }
    
  }
}
