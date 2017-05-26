package work;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;



public class Test {
  
  
  
  class Messenger implements Runnable {
    
    
    Socket socket;
    public Messenger(Socket socket) {
      this.socket = socket;
      System.out.println("클라이언트와 연결 되었음");
    }
    public void run() {
      
      //러너블의 규칙을 따라야한다
      //규칙으로 run 메소드를 만들어야 한다
      //규칙을 따르지 않으면 에러다
      
      try (
          Socket socket = this.socket;
          BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
          PrintStream out = new PrintStream(socket.getOutputStream());
          ) {
        while (true) {
          String text = in.readLine();
          if(text == null)
            break;
          
          
          System.out.println(text);
          out.println(text);
          out.flush();
          
        }
        System.out.println("클라이언트와 연결 끊김!");
          } catch (Exception e) {
            e.printStackTrace();
          }
    }
  }
  
  public void listen(int port) throws Exception {
    ServerSocket serverSocket = new ServerSocket(port);
    System.out.println("서버실행 중.....");
    while (true) {
      new Thread(new Messenger(serverSocket.accept())).start();
    }
  }

  public static void main(String[] args) throws Exception{
    Test server = new Test();
    server.listen(8888);
  }
}
