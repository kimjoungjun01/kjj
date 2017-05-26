package step18;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Test05_1 {
  public static void main(String[] args) throws Exception{
    if (args.length < 1) {
      System.out.println("사용법 > java -xp bin step18.Test05_1 URL");
      return;
    }
    
    String url = args[0].replace("http://", "");
    
    String host = null;
    int port = 80;
    int colonIndex = url.indexOf(":");
    int firstSlashIndex = url.indexOf("/");
    String path = url.substring(firstSlashIndex);
    
    if (colonIndex >= 0) {
      host = url.substring(0, colonIndex);
      port = Integer.parseInt(url.substring(colonIndex + 1, firstSlashIndex));
    } else {
      host = url.substring(0, firstSlashIndex);
    }
    System.out.println(url);
    System.out.println(host);
    System.out.println(port);
    System.out.println(path);
    
    try (
    Socket socket = new Socket(host, port);
    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    PrintStream out = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));) {
      
      out.printf("GET %s HTTP/1.1\n", path);
      
      out.printf("Host: %s\n", host);
      
      out.println();
      out.flush();
      
      String str = null;
      while (true) {
        str = in.readLine();
        System.out.println(str);
        if (str.length() == 0) {
          break;
        }
      }
      
      int ch;
      while ((ch = in.read()) != -1) {
        System.out.print((char)ch);
      }
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    
    
  }
}
