package step14;

public class Bucket {
  Object value;
  
  public void setValue(Object value) {
    this.value = value;
    System.out.println(value);
  }
  
  public Object getValue() {
    return value;
  }
}
