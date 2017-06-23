package step23.ex10;

import java.net.ServerSocket;
import java.util.HashMap;

public class HttpServer {
  int port;
  
  HashMap<String,Command> servletMap = new HashMap<>();

  public HttpServer(int port) {
    this.port = port;
    
    servletMap.put("/hello", new HelloServlet());
    servletMap.put("/ok", new OkServlet());
    servletMap.put("/error", new ErrorServlet());
  }
  
  public void listen() throws Exception {
    ServerSocket serverSocket = new ServerSocket(this.port);
    System.out.println("서버 실행 중....");

    while (true) {
      new HttpProcessor(serverSocket.accept(), servletMap).start();
    } //멀티쓰레드로 만드는게 이것
  
  }
  
  public static void main(String[] args) throws Exception {
    HttpServer server = new HttpServer(8888);
    server.listen();
    
  }
  
 
}  
   