package step18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Test04_2 {
  public static void main(String[] args) throws Exception{
    if (args.length < 1) {
      System.out.println("사용법 > java -xp bin step18.Test04_2 서버주소 포트번호 파일명");
      return;
    }
    
    File file = new File(args[2]);
    try (
    BufferedInputStream fileIn = new BufferedInputStream(new FileInputStream(file));
    
    
    Socket socket = new Socket(args[0], Integer.parseInt(args[1]));
    Scanner in = new Scanner(socket.getInputStream());
    DataOutputStream out = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));) {
      
      out.writeUTF(file.getName());
      
      out.writeLong(file.length());
      
      for (long i = 0; i < file.length(); i++) {
        out.write(fileIn.read());
      }
      out.flush();
      
      
      System.out.println(in.nextLine());
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    
    
  }
}
