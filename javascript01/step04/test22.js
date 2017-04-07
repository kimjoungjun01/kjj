"use strict"

var arr = ['홍길동', '임꺽정', "유관순", "안중근", "윤봉길"]
var count = -1;

function outer() {//글로벌 함수를 사용한다면 복제를 하지않고 그 자체의 함수를 계속 실행한다
  count++;
  return function() {
    console.log(arr[count])
  }
}
//즉 최종 값(count = 4)이 함수에 적용되고 출력되는것이다.

var f1 = outer();
var f2 = outer();
var f3 = outer();
var f4 = outer();
var f5 = outer();

f1();
f2();
f3();
f4();
f5();
