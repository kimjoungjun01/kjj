"use strict"

function f1() {
  console.log("f1().... 호출됨")
}

function f2() {
  console.log("f2().... 호출됨")
}
var v1 = f1; // v1이라는 변수에 f1함수의 주소({console.log.log})를 저장한다.
var v2 = v1; // v2라는 변수에 f1함수의 주소({console.log})를 저장한다.

f1();
v1();
v2();

var v1 = f2; // v1이라는 변수에 f2함수의 주소({console.log})를 저장한다.
             // f1함수의 주소를 f2함수의 주소로 덮어쓴다.
v1();
