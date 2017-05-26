package step01;

public class Test02 {

  public static void main(String[] args) {
    
    //기본 데이터 타입
    
    //1)정수 데이터 형
    System.out.println('가');//문자 2바이트 크기
    System.out.println(100); //정수 4바이트 크기
    System.out.println(100L); //정수 8바이트 크기
    
    //2)부동소수점 데이터 형
    System.out.println(3.14f); //부동소수점 4바이트 크기
    System.out.println(3.14); //부동소수점 8바이트 크기
    
    //3)논리 데이터 형 
    System.out.println(true); //논리 4바이트 크기
    
    //4)객체 데이터 형
    System.out.println("문자열");
//  System.out.println('문자열'); 에러 작은따옴표 안에는 문자 하나만 가능. 주의할것
  }
}
