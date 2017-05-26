package step08;

import java.sql.Date;

public class Test06_4 {
  
  public static void main(String[] args) {
    Test06_2_ArrayList dateList = new Test06_2_ArrayList();
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
      //형변환해준다 Date타입으로
      //그냥은 getMonth() 메소드를 호출할 수 없다
      //이건 ArrayList 타입이 아니고 Date타입이기때문
      
      //이 방법의 문제점은 값을 꺼낼때 마다 형변환을 해줘야 한다는 점이다.
      Date date = (Date)dateList.get(i);
      
      System.out.printf("%d월%d일\n", date.getMonth(), date.getDate());
    }
    
    
  }
  
}







