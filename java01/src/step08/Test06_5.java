package step08;
//제네릭 사용후

import java.sql.Date;

public class Test06_5 {
  
  public static void main(String[] args) {
    //날짜 타입만 들어가도록 제한할 수 있다
    Test06_5_ArrayList<Date> dateList = new Test06_5_ArrayList<>();
    java.util.Date today = new java.util.Date();
    
    dateList.add(Date.valueOf("2017-3-1"));
    dateList.add(Date.valueOf("2017-5-3"));
    dateList.add(Date.valueOf("2017-5-5"));
    dateList.add(Date.valueOf("2017-5-9"));
    dateList.add(Date.valueOf("2017-6-6"));
    
    
    for (int i = 0; i < dateList.size(); i++) {
      
      System.out.printf("%d년 %d월 %d일\n", ((java.util.Date) dateList.get(i)).getYear() + 1900 ,((java.util.Date) dateList.get(i)).getMonth() + 1 , ((java.util.Date) dateList.get(i)).getDate());
    }
    //이클립스에서 찾아주는데로 하거나
    System.out.println("----------------");
    
    for (int i = 0; i < dateList.size(); i++) {
      Date date = dateList.get(i);
      //제네릭 사용하면 형변환 해줄 필요가 없다!
      System.out.printf("%d월%d일\n", date.getMonth(), date.getDate());
    }
    
    
  }
  
}







