package step25;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Annotation06 {
  String value() default "hello";
  String value2() default "hi";
  
  
  
}
