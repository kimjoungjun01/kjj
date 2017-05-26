package step01;
public class Test12 {
  public static void main(String[] args) {
    System.out.println("ABC\b가각간"); //backspace(0x0008)
    System.out.println("ABC\t가각간"); //tab
    System.out.println("ABC\n가각간"); //줄바꿈 linefeed(new line)
    System.out.println("ABC\f가각간"); //현재 커서의 위치에서 줄바꿈 homefeed
    System.out.println("\b,\f,\r,\t,\n,\",\',\\");
    System.out.println("------------------");
    System.out.println("ABC\r가각간"); //커서를 처음으로 보냄 carrage return
    System.out.println("ABC\"가각간"); //
    System.out.println("ABC\'가각간"); //큰따옴표 안에서'는' 굳이 \ 를 써줄 필요없다
    
    char c2 = '\''; //이럴때 써주는 것이다
    //그리고 \는 일종의 명령어라서 \하만 쓰면 에러가난다
    System.out.println(c2); 
    
    //System.out.println("c:\workspace\java01\src\step01\Test12.java"); 이건 에러 
    System.out.println("c:\\workspace\\java01\\src\\step01\\Test12.java");
    
  }
}

