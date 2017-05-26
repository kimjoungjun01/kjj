package step09.ex2;
//BasicCalculator 의 코드를 재사용 하고, 
//거기ㅔ다 곱하기를 수행하는 메서드를 추가한다.
//BasicCalculator의 코드를 복붙할 필요가 없다
//기존의 BasicCalculator 코드를 그대로 공유한다
//따라서 BasicCalculator클래스가 없으면 AdvancedCalculator는 사용할 수 없다
public class AdvancedCalculator extends BasicCalculator {
  
  void multiple(int value) {
    this.result *= value;
  }
}
