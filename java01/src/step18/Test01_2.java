package step18;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Test01_2 {
  public static void main(String[] args) throws Exception{
    Socket socket = new Socket("localhost", 8888);
    
    InputStream in = socket.getInputStream();
    OutputStream out = socket.getOutputStream();
    
    
    out.write(0x77);
    int b = in.read();
    System.out.printf("%x\n", b);
    
    in.close();
    out.close();
    socket.close();
  }
}
