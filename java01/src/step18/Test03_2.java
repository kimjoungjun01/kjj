package step18;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Test03_2 {
  
  static class MyThread extends Thread {
    Socket socket;
    
    public MyThread(Socket socket) {
      this.socket = socket;
    }
    public void run () {
      try(
          InputStream in0 = socket.getInputStream();
          OutputStream out0 = socket.getOutputStream();
          Scanner in = new Scanner(in0);
          PrintStream out = new PrintStream(out0);) {
      
        System.out.println("클라이언트 연결 승인!");
        String str = in.nextLine();
        out.println(str);
      } catch (Exception e) {

      }
    }
  }
  
  public static void main(String[] args) throws Exception{
    
    System.out.println("서버실행중");
    
    ServerSocket serverSocket = new ServerSocket(8888);
    System.out.println("서버소켓 생성 완료");
    
    while (true) {
      MyThread t = new MyThread(serverSocket.accept());
    }
  }
}
