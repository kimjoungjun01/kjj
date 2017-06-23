package step23.ex6;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer {
  int port;
  
  public HttpServer(int port) {
    this.port = port;
  }
  
  public void listen() throws Exception {
    ServerSocket serverSocket = new ServerSocket(this.port);
    System.out.println("서버 실행 중....");

    while (true) {
      new HttpProcessor(serverSocket.accept()).start();
    } //멀티쓰레드로 만드는게 이것
  
    
  }
  
  public static void main(String[] args) throws Exception {
    HttpServer server = new HttpServer(8888);
    server.listen();
    
  }
  
  class HttpProcessor extends Thread {
    Socket socket;
    
    public HttpProcessor(Socket socket) {
      this.socket = socket;
    }
    
    public void run() {
      try (Socket socket = this.socket;
          BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
          PrintStream out = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));) {

        String line = null;
        boolean requestLine = true;
        while (true) {
          line = in.readLine();
          if (line.isEmpty())
            break;

          if (requestLine) {
            System.out.println(line);
            requestLine = false;
          }
        }
        out.println("HTTP/1.1 200 OK");
        out.println("Server: BIT Server");
        out.println();
        out.println("<html>");
        out.println("<head>");
        out.println(" <meta charset='UTF-8'>");
        out.println(" <title>hello</title>");
        out.println("</head>");
        out.println("<body>");
        out.println(" <h1>안녕하세요</h1>");
        out.println("</body>");
        out.println("</html>");
        out.flush();
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
  }
}  
   