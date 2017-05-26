package step08;

import java.util.Properties;
import java.util.Set;

public class Test08_3 {
  public static void main(String[] args) throws Exception{
    for (String value : args) {
      System.out.println(value);
    }
    System.out.println("=--------------------------=");
    
    
    Properties props = System.getProperties();
    System.out.printf("name=%s\n", props.get("name"));
    System.out.printf("age=%s\n", props.get("age"));
    System.out.printf("tel.home=%s\n", props.get("home"));
    System.out.printf("tel.office=%s\n", props.get("office"));
    System.out.println("=--------------------------=");
    
    //아규먼트로 값 받기
    for (int i = 0; i < args.length; i++) {
      System.out.printf(args[i] + "=%s\n", props.getProperty(args[i]));
    }
  }
}
