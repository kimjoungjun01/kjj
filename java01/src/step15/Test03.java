package step15;

import step13.Constants.school;

public class Test03 {
  public static void main(String[] args) {
    
  //enum 객체의 기본 값
    SchoolLevel[] values = SchoolLevel.values();
    
    for (SchoolLevel value : values) {
    System.out.printf("name() = %s\n", value.name());
    System.out.printf("toString() = %s\n", value.toString());
    System.out.printf("ordinal() = %s\n", value.ordinal());
    
    System.out.println("-----------------------------------");
    
    }
  }
}
