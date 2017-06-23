package step23.ex12;

import java.io.File;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.HashMap;

public class HttpServer {
  int port;
  HashMap<String,Command> servletMap = new HashMap<>();
  String currBinDirpath;

  ArrayList<Class> classes = new ArrayList<>();
  
  public HttpServer(int port) throws Exception {
    this.port = port;
    
    currBinDirpath = new File("./bin").getCanonicalPath().replaceAll("\\\\", "/") + "/";
    System.out.println(currBinDirpath);
    
    findClassFile(new File("./bin/"), "step23.ex12");
    
    for (Class clazz : classes) {
      WebServlet anno = (WebServlet)clazz.getAnnotation(WebServlet.class);
      if (anno == null) continue;
      servletMap.put(anno.url(), (Command)clazz.newInstance());
    }
  }
  
  public void listen() throws Exception {
    ServerSocket serverSocket = new ServerSocket(this.port);
    System.out.println("서버 실행 중....");

    while (true) {
      new HttpProcessor(serverSocket.accept(), servletMap).start();
    } //멀티쓰레드로 만드는게 이것
  
  }
  
  private void findClassFile(File path, String packageName) throws Exception {
    File[] files = path.listFiles((File pathname) -> {
        if (pathname.isDirectory())
          return true;
        if (pathname.getName().endsWith(".class") &&
            pathname.getName().indexOf('$') < 0)
          return true;
        return false;
      });
    
    for (File file : files) {
      if (file.isDirectory())
        findClassFile(file, packageName);   
      else {
        
        String classFullName = file.getCanonicalPath()
                               .replaceAll("\\\\", "/")
                               .replaceAll(this.currBinDirpath, "")
                               .replaceAll("/", ".")
                               .replaceAll(".class", "");
        
        if (classFullName.startsWith(packageName)) {
          classes.add(Class.forName(classFullName));
        }
      }
    }
  }
  
  public static void main(String[] args) throws Exception {
    HttpServer server = new HttpServer(8888);
    server.listen();
  }
}  
   