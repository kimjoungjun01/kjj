package step23.ex2;
   
public class HttpServer {
  int port;
  
  public HttpServer(int port) {
    this.port = port;
  }
  
  public void listen() {
    
  }
  
  public static void main(String[] args) {
    HttpServer server = new HttpServer(8888);
    server.listen();
  }
   
}  
   