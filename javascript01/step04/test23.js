"use strict"

var arr = ['홍길동', '임꺽정', "유관순", "안중근", "윤봉길"]
var count = -1;
//클로저의 성질 알아보기
function outer() {//로컬변수를 사용할땐 함수를 무조건 복제한다
  var  i = ++count;
  return function() {//함수안의 함수를 클로저라한다
    console.log(arr[i])
  }
}
//즉 함수가 한번 실행될때마다의 값을 저장한다

var f1 = outer();
var f2 = outer();
var f3 = outer();
var f4 = outer();
var f5 = outer();
//결과적으로 각각의 outer 라는 같은 이름의 별개의 함수가 만들어지는것
f1(); //count = 0 인 outer 함수
f2(); //count = 1 인 outer 함수
f3(); //count = 2 인 outer 함수
f4(); //count = 3 인 outer 함수
f5(); //count = 4 인 outer 함수
