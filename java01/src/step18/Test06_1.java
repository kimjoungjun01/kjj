package step18;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Test06_1 {
  static class EchoThread extends Thread {
    Socket socket;
    
    public EchoThread(Socket socket) {
      this.socket = socket;
    }
    public void run() {
      try (
          Socket socket = this.socket;
          Scanner in = new Scanner(socket.getInputStream());
          PrintStream out = new PrintStream(socket.getOutputStream());
          ) {
        String message = in.nextLine();
        out.println("[운칠기삼]" + message);
      } catch (Exception e) {}
    }
    
  }
  public static void main(String[] args) throws Exception{
    ServerSocket serverSocket = new ServerSocket(8888);
    
    System.out.println("서버실행 중.....");
    
    while (true) {
      new EchoThread(serverSocket.accept()).start();
    }
  }
}
