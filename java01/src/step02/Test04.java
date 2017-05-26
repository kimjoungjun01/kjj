package step02;

public class Test04 {

  public static void main(String[] args) {
    short s;   //short: -32768~32767
    s=-32768;
    s = 32767;
    
    char c;    //2byte 크기의 메모리
               //char: 0~65535
    c = 0;
    c = 65535;//char에는 음수를 넣을수 없다
    
    c = 44032;
    System.out.println(c);
    
    c = '가'; // '가' 문자를 저장하는게 아닌 '가' 라는 문자의 유니코드 값을 저장하는 것이다
    System.out.println(c);
    
    int i1 = '\b';
    int i2 = '\t';
    int i3 = '\n';
    int i4 = '\f';
    int i5 = '\r';
    int i6 = '\'';
    int i7 = '\"';
    int i8 = '\\';
    
    System.out.printf("%x, %x, %x, %x, %x, %x, %x, %x", i1, i2, i3, i4, i5, i6, i7, i8);
    //%x: 16진수로 표현하라
    

    
  }
}
