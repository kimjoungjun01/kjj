package step18;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.google.gson.Gson;

public class Test07_2 {
  class Value {
    int v1;
    int v2;
    String op;
  }

  class CalculatorJob implements Runnable {

    Socket socket;
    public CalculatorJob(Socket socket) {
      this.socket = socket;
      System.out.println("클라이언트와 연결 되었음");
    }
    public void run() {
      int count = 0;
      //러너블의 규칙을 따라야한다
      //규칙으로 run 메소드를 만들어야 한다
      //규칙을 따르지 않으면 에러다

      try (
          Socket socket = this.socket;
          BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
          PrintStream out = new PrintStream(socket.getOutputStream());
          ) {
        String json = in.readLine();
        if(json == null)
          return;


        Gson gson = new Gson();
        Value value = gson.fromJson(json, Value.class);

        float result = 0f;
        switch (value.op) {
        case "+": result = (float)value.v1 + value.v2; break;
        case "*": result = (float)value.v1 * value.v2; break;
        case "/": result = (float)value.v1 / value.v2; break;
        case "-": result = (float)value.v1 - value.v2; break;
        case "%": result = (float)value.v1 % value.v2; break;
        }

        if (++count > 5) {
          out.println("무료 사용 끝!");
        } else {
          out.println(result);
        }

        out.flush();

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
      new Thread(new CalculatorJob(serverSocket.accept())).start();
    }
  }

  public static void main(String[] args) throws Exception{
    Test07_2 server = new Test07_2();
    server.listen(8888);
  }
}
