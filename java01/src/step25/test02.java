package step25;

public class test02 {
  public static void main(String[] args) throws Exception {
    Class clazz = Class02.class;
    
    
    Annotation04 anno = (Annotation04)clazz.getAnnotation(Annotation04.class);
    System.out.printf("v1=%s\n", anno.v1());
    System.out.printf("v2=%s\n", anno.v2());
    System.out.printf("v3=%s\n", anno.v3());
    System.out.printf("v4=%s\n", anno.v4());
  }
}
