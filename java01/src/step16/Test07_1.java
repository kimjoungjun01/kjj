/* character stream 클래스: FileReader vs FileInputStream        
 */
package step16;

import java.io.InputStream;
import java.util.Scanner;

public class Test07_1 {

  public static void main(String[] args) throws Exception {
    InputStream in = System.in;
    
    Scanner keyScanner = new Scanner(in);
    
    String str = keyScanner.nextLine();
    //다음줄로 갈때까지 srt을 리턴하지 않는다~~
    System.out.printf("==>%s\n", str);
    
    keyScanner.close();
    in.close();
    //키보드에서 데이터를(한 줄) 읽는 방법
  }

}









