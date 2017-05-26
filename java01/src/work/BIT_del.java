package work;

import java.io.File;

public class BIT_del {
  public static void main(String[] args) {
    File f = new File("src/work/temp/" + args[0]);
    File f2 = new File("src/work/temp");
    File[] f3 = f2.listFiles();
    String str = args[1];
    
    
    if (args[0].equals("-R")) {
      if (f3.isDirectory() || (f3.isFile() && f3.getName().endsWith(str))) {
        if (f2.delete()) {
          System.out.println("해당파일 전부 삭제 성공");
        }
      }
      for (File file : files) {
        if (file.isDirectory()) {
          displayDirectory(file, level + 1);
        } else {
          System.out.printf("%s\n", file.getPath());
        }
        
      }
//      for(int i = 0; i < f3.length; i++) {
//        f3[i].delete();
//        
//      }
      
    } else if (f.delete()) {
      System.out.println("삭제 성공");
    } else {
      System.out.println("해당파일이 없슴다");
    }
    
    
  }
}
