package step05;

public class Test05 {
  
  
  public static java.util.HashMap getStudent(int studentNo) {
    java.util.HashMap map = new java.util.HashMap();
    map.put("이름", "홍길동");
    map.put("국어", 100);
    map.put("영어", 90);
    map.put("수학", 80);
    map.put("총점", 100 + 90 + 80);
    map.put("평균", (100 + 90 + 80) / 3f);
    return map;
  }
  
  public static void main(String[] args) {
    java.util.HashMap map = getStudent(100);
    System.out.println(map.get("이름"));
    System.out.println(map.get("국어"));
    System.out.println(map.get("영어"));
    System.out.println(map.get("수학"));
    System.out.println(map.get("총점"));
    System.out.println(map.get("평균"));
  }
}
