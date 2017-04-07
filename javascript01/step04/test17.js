"use strict"

var v1 = 100;

function f1() {
  //함수안에서 변수를 선언하면 모두 별개의 변수가 된다. (이름이 같던말던)
  //이를 로컬 변수라 한다.
  var v1 = 200;
  var v2 = 300;
  //로컬변수는 함수가 끝나면 제거된다.
  console.log("f1():", v1, v2);
}

console.log(v1);//글로벌변수 v1을 출력
f1();
console.log(v1);
//console.log(v2); //함수가 끝나고 로컬변수가 제거되어 찾을수 없다는 에러뜬다.
f1();
