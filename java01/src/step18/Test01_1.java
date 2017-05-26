package step18;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Test01_1 {
  public static void main(String[] args) throws Exception{
    
    System.out.println("서버실행중");
    
    ServerSocket serverSocket = new ServerSocket(8888);
    
    Socket socket = serverSocket.accept();
    
    
    InputStream in = socket.getInputStream();
    OutputStream out = socket.getOutputStream();
    
    int b = in.read();
    System.out.printf("%x\n", b);
    
    out.write(0x01);
    
    in.close();
    out.close();
    socket.close();
    serverSocket.close();
  }
}
