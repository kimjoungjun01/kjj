package step18;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Test04_1 {
  public static void main(String[] args) throws Exception{
    
    System.out.println("서버실행중");
    
    ServerSocket serverSocket = new ServerSocket(8888);
    
    while (true) {
      try (Socket socket = serverSocket.accept();
        DataInputStream in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        PrintStream out = new PrintStream(socket.getOutputStream());) {
        
        String filename = in.readUTF();
        
        long length = in.readLong();
        try (BufferedOutputStream fileOut = new BufferedOutputStream(
                                                   new FileOutputStream("temp/" + filename));) {
          for(long i = 0; i < length; i++) {
            fileOut.write(in.read());
          }
          fileOut.flush();
        } catch (Exception e) {
          System.out.println("파일 저장 중 오류 발생");
        }
        
        out.println("ok");
        
      } catch (Exception e) {
      e.printStackTrace();
      }
    }
  }
}
