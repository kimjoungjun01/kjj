package step25;

public class test01 {
  public static void main(String[] args) throws Exception {
    
//    Class clazz = Class.forName("step25.Class01");
    
    Class clazz = Class01.class;
    
    
    Annotation01 anno01 = (Annotation01)clazz.getAnnotation(Annotation01.class);
    if (anno01 == null) {
      System.out.println("Annotation01 애노테이션을 추출하지 못했다");
    }
    
    
    Annotation03 anno03 = (Annotation03)clazz.getAnnotation(Annotation03.class);
    if (anno03 == null) {
      System.out.println("Annotation03 애노테이션을 추출하지 못했다");
    }
    
  }
}
