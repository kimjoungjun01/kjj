"use strict"
//함수 안에서 글로벌 변수가 적용이 된다.
var v1 = 100;

function f1() {            //함수를 호출하면
  console.log("f1():", v1);//v1에 100을 넣은 값을 출력하고
  v1 = 200;                //v1의 값을 200으로 바꾼다
}

console.log(v1);//함수 실행 전
f1();//함수 실행
console.log(v1);//함수 실행 후
f1();
