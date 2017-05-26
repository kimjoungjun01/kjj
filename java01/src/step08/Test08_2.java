package step08;

import java.util.Properties;
import java.util.Set;

public class Test08_2 {
  public static void main(String[] args) throws Exception{
    Properties props = System.getProperties();
    Set<Object> keySet = props.keySet();
    for (Object key : keySet) {
      System.out.printf("%s=%s\n", key, props.get(key));
    }
    
  }
}
