package step19;

public class Test01 {
  public static void main(String[] args) {
    Thread t = Thread.currentThread();
    System.out.println(t.getName());
    
    ThreadGroup g = t.getThreadGroup();
    System.out.println(g.getName());
    
    ThreadGroup g2 = g.getParent();
    System.out.println(g2.getName());
    
    ThreadGroup g3 = g2.getParent();
//    System.out.println(g3.getName()); 음슴
    
   
    System.out.println("┬╀─╁─╃┬╄──╅┬╆┬╇─╈─╊┬╉─");
    printThreadGroup(g2, "");
    
    
  }
  
  
  static void printThreadGroup(ThreadGroup tg, String prefix) {
    System.out.printf("%s['%s']--\n", prefix, tg.getName());
    ThreadGroup[] groupArray = new ThreadGroup[10];
    int count = tg.enumerate(groupArray, false);
    for (int i = 0; i < count; i++) {
      printThreadGroup(groupArray[i], prefix + "  ");
    }
    
    Thread[] threadArray = new Thread[10];
    count = tg.enumerate(threadArray, false);
    for (int i = 0; i < count; i++) {
      System.out.printf("%s(%s)\n", prefix + "  ", threadArray[i].getName());
    }
  }
  
}
