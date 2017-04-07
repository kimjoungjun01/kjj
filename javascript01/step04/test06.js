"use strict"

f1();
f2(); // f2변수는 호이스팅 되지만 익명함수가 저장된 상태는 아니라서 함수형태가
     //아니라는 에러가 뜬다

function f1() {
  console.log("okok");
}

var f2 = function() {
  console.log("익명함수1.......");
}
