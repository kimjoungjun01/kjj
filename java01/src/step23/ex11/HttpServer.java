package step23.ex11;

import java.io.FileReader;
import java.net.ServerSocket;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

public class HttpServer {
  int port;
  
  HashMap<String,Command> servletMap = new HashMap<>();

  public HttpServer(int port) throws Exception {
    this.port = port;
    Properties props = new Properties();
    props.load(new FileReader("src/step23/ex11/web.properties"));
    
    Set<String> urlSet = props.stringPropertyNames();
    for (String url : urlSet) {
      String classFullName = props.getProperty(url);
      Class clazz = Class.forName(classFullName);
      servletMap.put(url, (Command)clazz.newInstance());
    }
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
   