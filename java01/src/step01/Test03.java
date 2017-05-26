package step01;
public class Test03 {
  public static void main(String[] args) {
    //그냥 숫자를 작성하는 것은 4바이트 크기의 정수
    System.out.println(-10);
    System.out.println(10);
    System.out.println(2147483647); //4바이트 양의 정수 최대 값
    System.out.println(-2147483648);//4바이트 음의 정수 최대 값
    
    //2) 8바이트 정수 값을 표현할 때는 숫자 뒤에 L, l 을 붙인다 둘 중 아무거나 가능
    //하지만 숫자 1과 l은 혼동될 수 있기 때문에 주로 L을 붙인다
    System.out.println(-10l);
    System.out.println(10l);
    System.out.println(2147483647L); //4바이트 양의 정수 최대 값 넘어도 괜찮다
    System.out.println(-2147483648L);//4바이트 음의 정수 최대 값 넘어도 괜찮음
    System.out.println(9223372036854775807L);//8바이트 양의 정수 최대값 넘을 수 없음
    System.out.println(-9223372036854775808L);//8바이트 음의 정수 최대값 넘을 수 없음

  }
}

/* 리터럴 (literal)?
 * =>코드에서 값을 표현한 것.
 */
 