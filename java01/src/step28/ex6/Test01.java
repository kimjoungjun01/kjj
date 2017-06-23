package step28.ex6;

import java.util.HashMap;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class Test01 {

  public static void main(String[] args) throws Exception{
    ApplicationContext ctx = new ClassPathXmlApplicationContext("step28/ex6/application-context.xml");

    System.out.println("----------------------------------------------");
    
    String[] names = ctx.getBeanDefinitionNames();
    
    for(String name : names) {
      System.out.printf("%s ===> %s\n", name, ctx.getBean(name));
    }
    
    TeacherDao teacherDao = ctx.getBean(TeacherDao.class);    
    HashMap<String,Object> valueMap = new HashMap();
    valueMap.put("start", 1);
    valueMap.put("pageSize", 100);
    
    List<Teacher> list = teacherDao.selectList(valueMap);
    
    for(Teacher t : list) {
      System.out.printf("%d, %s, %s, %s, %s\n", t.getNo(), t.getName(), t.getEmail(), t.getTel(), t.getHomepage());
    }
    
  }

}
