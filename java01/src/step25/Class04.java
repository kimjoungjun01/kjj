package step25;

public class Class04 {
  @Annotation06()
  class Test01 {}
  
  @Annotation06
  class Test02 {}
  
  @Annotation06(value="값값값")
  class Test03 {}
  
  @Annotation06(value2="값값값")
  class Test04 {}
  
  @Annotation06("값값값")
  class Test05 {}
  
  @Annotation06(value="값값값", value2="값값값")
  class Test06 {}
}
