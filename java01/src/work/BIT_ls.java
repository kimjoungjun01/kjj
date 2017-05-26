package work;

import java.io.File;

public class BIT_ls {

  public static void main(String[] args) throws Exception {
    File f = new File("src/work//temp");
    
    displayDirectory(f, 0);
  }
  
  public static void displayDirectory(File dir, int level) {
    File[] files = dir.listFiles();
    
    for (File file : files) {
      for (int i = 0; i < level; i++) System.out.print("  ");
      
      System.out.printf("%s %s %d\n", 
          (file.isDirectory() ? "d" : "-"),
          file.getName(),
          file.length());
      
      if (file.isDirectory()) {
        displayDirectory(file, level + 1);
      }
    }
  }

}









