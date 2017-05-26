package step18;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Test02_2 {
  public static void main(String[] args) throws Exception{
    Scanner keyScanner = new Scanner(System.in);
    
    System.out.print("서버주소: ");
    String serverAddress = keyScanner.nextLine();
    
    System.out.print("포트번호: ");
    int port = Integer.parseInt(keyScanner.nextLine());
    
    Socket socket = new Socket(serverAddress, port);
    System.out.println("=>소켓 객체 생성 완료!");
    
    InputStream in0 = socket.getInputStream();
    OutputStream out0 = socket.getOutputStream();
    
    Scanner in = new Scanner(in0);
    PrintStream out = new PrintStream(out0);
    System.out.println("=>입출력 스트림 준비 완료!");
    
    
    System.out.print("서버에 보낼 메시지: ");
    String message = keyScanner.nextLine();
    
    out.println(message);
    System.out.println("=>서버에 메시지 전송 완료~"); 
    
    
    String response = in.nextLine();
    System.out.println("=>서버로부터 메시지 수신완료");
    
    System.out.println(response);
    
    in.close();
    in0.close();
    out.close();
    out0.close();
    socket.close();
    keyScanner.close();
  }
}
