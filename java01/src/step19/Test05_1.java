package step19;

public class Test05_1 {
  static class Account {
    long balance;
    public Account(long balance) {
      this.balance = balance;
    }
    
    public long withdraw(long money) {
      long temp = this.balance;
      
      double x = 3/141592;
      int delayCount = (int)(Math.random() * 10);
      for (int i = 0; i < delayCount; i++)
        x /= 345.2345;
      
      temp -= money;
      
      if (temp >= 0) {
        this.balance = temp;
        return money;
      }
      return 0;
    }
    
  }
  
  static class ATM extends Thread {
    Account account;
    
    public ATM(String name, Account account) {
      super(name);
      this.account = account;
    }
    
    public void run() {
      long sum = 0;
      for (int i = 0; i < 10000; i++) {
        long money = this.account.withdraw(100);
        if (money == 0)
          break;
        sum += money;
      }
      System.out.printf("%s = %d\n", this.getName(), sum);
    }
  }

  
  public static void main(String[] args) {
    Account account = new Account(1_000_000);
    ATM t1 = new ATM("강남", account);
    ATM t2 = new ATM("강북", account);
    ATM t3 = new ATM("강원", account);
    ATM t4 = new ATM("제주도", account);
    
    t1.start();
    t2.start();
    t3.start();
    t4.start();
  }
}
