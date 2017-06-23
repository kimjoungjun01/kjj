package step23.ex9;

import java.net.ServerSocket;

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
  
 
}  
   