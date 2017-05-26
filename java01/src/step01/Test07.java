package step01;
public class Test07 {
  public static float f=12.375f;
  public static void main(String[] args) {
    //1) 4바이트 메모리 = single precision(단정도 : 한 개(7자리)의 정밀도)
    System.out.println(987.654f);
    System.out.println(987.6549f);
    System.out.println(9.999999f);
    //7자리 까지는 안전하게 값이나오는데 유효자리수를 넘어가면 값이 잘린다
    //그러나 오류는 발생하지 않는다
    System.out.println(987.65498f);
    System.out.println(999.99999f);
    System.out.println(9.9999999f);
    
    //2) 8바이트 메모리 = double precision(배정도 : 단정도 보다 두 배 정밀하다)
    System.out.println(987.654);
    System.out.println(987.6549);
    System.out.println(987.65498);
    System.out.println(987.654987);
    System.out.println(987.654987654321);
    //8바이트의 유효자리수는 17자리이다
    System.out.println(999.99999999999999);
  }
}

/* 리터럴 (literal)?
 * =>코드에서 값을 표현한 것.
 */

