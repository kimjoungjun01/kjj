package step25;

public class test03 {
  public static void main(String[] args) throws Exception {
    Class clazz = Class03.class;
    
    
    Annotation05 anno = (Annotation05)clazz.getAnnotation(Annotation05.class);
    System.out.printf("v1=%s\n", anno.v1()[0]);
    System.out.printf("v2=%s\n", anno.v2()[0]);
    System.out.printf("v3=%s\n", anno.v3()[0]);
    System.out.printf("v4=%s\n", anno.v4()[1]);
    System.out.printf("v5=%s\n", anno.v5()[0]);
    System.out.printf("v6=%s\n", anno.v6()[0]);
  }
}
